package net.sf.ictalive.svcrepo;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;

import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.service.tool.AbstractFileSystemRepositoryCallback;
import net.sf.ictalive.service.tool.AliveOntRepoCallback;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.FileSystemRepositoryCallbackImpl;

import org.apache.log4j.Logger;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Simple service repository which uses one or more directories to source
 * services from.
 * 
 * Servics are loaded by specifying directories, with
 * {@link #setServiceDirectories(File[])} optionally setting a knowledge base
 * 
 * @author occ
 * 
 */
public class StaticFileSystemServiceRepo extends RepositoryBase implements
		ServiceRepository, OntologyRepository {

	Logger log = Logger.getLogger(StaticFileSystemServiceRepo.class);
	File serviceDirectories[];
	String matchFiles[] = new String[] { ".*\\.owls", ".*\\.owl" };

	public String[] getMatchFiles() {
		return matchFiles;
	}

	@Override
	public Collection<URI> getAllServiceURIs() {
		List<URI> serviceURIs = new LinkedList<URI>();
		for (Service s : owlKB.getServices(false))
			serviceURIs.add(s.getURI());
		return serviceURIs;
	}

	public void setMatchFiles(String[] matchFiles) {
		this.matchFiles = matchFiles;
	}

	public File[] getServiceDirectories() {
		return serviceDirectories;
	}

	public void setServiceDirectories(File[] serviceDirectories) {
		this.serviceDirectories = serviceDirectories;
	}

	@Override
	public Collection<Service> searchServices(DiscoverySearch srch) {
		throw new IllegalStateException("Not implemented");
	}

	@Override
	public void searchServices(DiscoverySearch srch,
			HandlerCallBack<Service> resultHandler) {
		throw new IllegalStateException("Not  implemented");

	}

	@Override
	public void setOwlKB(OWLKnowledgeBase owlKB) {
		super.setOwlKB(owlKB);
		if (useLocalImportReader) {
			AliveRepoManagerHook.setup(true);
			AliveRepoManagerHook
					.addLocatorCallback(new AbstractFileSystemRepositoryCallback() {

						@Override
						public File[] getServiceDirectories() {
							// TODO Auto-generated method stub
							return serviceDirectories;
						}
					});
		}
	}

	/**
	 * Loads all services by iterating through the specified directories looking
	 * for services.
	 */
	public void loadAllFiles() {
		log.debug("loading services. ");
		Pattern filePatterns[] = new Pattern[matchFiles.length];
		int i = 0;
		for (String strPattern : matchFiles) {
			filePatterns[i++] = Pattern.compile(strPattern);
		}
		if (serviceDirectories == null) {
			return;
		}
		if (owlKB == null) {
			log.debug("no existing KB specified, using a new one");
			setOwlKB(OWLFactory.createKB());
		}
		for (File dir : serviceDirectories) {
			log.debug("searching for services in " + dir);
			if (!dir.isDirectory()) {
				log.warn("Path " + dir + " is not a directory, ignoring");
				continue;
			}
			SVCFILE: for (File serviceFile : dir.listFiles()) {
				log.debug("looking for service in " + serviceFile);
				boolean matched = false;
				PMATCH: for (Pattern pattern : filePatterns) {
					Matcher matcher = pattern.matcher(serviceFile.toString());
					if (matcher.matches()) {
						matched = true;
						log
								.debug("File " + serviceFile + " matched "
										+ pattern);
						break PMATCH;
					}
				}
				if (!matched) {
					log.debug(serviceFile + " did not match, skipping");
					continue SVCFILE;
				}

				try {

					// god, what a hack, the KB doesn't honor xml:base except
					// for imports,
					// parse document and extract the base as the URI
					Document xmlDoc = DocumentBuilderFactory.newInstance()
							.newDocumentBuilder().parse(serviceFile);

					Element elem = xmlDoc.getDocumentElement();
					String xmlbase = elem.getBaseURI();

					log.debug("Document base URI is " + xmlbase);

					OWLOntology service;
					if (xmlbase != null) {
						service = owlKB.read(new FileInputStream(serviceFile),
								URI.create(xmlbase));
					} else {
						service = owlKB.read(serviceFile.toURI());
					}

					if (service != null) {
						for (RepositoryListener<OWLOntology> ls : listeners) {

							ls.onServiceRegistered(service);
						}

						log.debug("Added service " + service.getURI());
					}
				} catch (Exception e) {
					log.debug("Failed to load service from " + serviceFile
							+ " with exception " + e);

				}
			}
		}
	}
}
