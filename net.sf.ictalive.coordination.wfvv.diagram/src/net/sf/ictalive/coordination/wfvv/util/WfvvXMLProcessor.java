/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv.util;

import java.util.Map;

import net.sf.ictalive.coordination.wfvv.WfvvPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WfvvXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfvvXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		WfvvPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the WfvvResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new WfvvResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new WfvvResourceFactoryImpl());
		}
		return registrations;
	}

} //WfvvXMLProcessor
