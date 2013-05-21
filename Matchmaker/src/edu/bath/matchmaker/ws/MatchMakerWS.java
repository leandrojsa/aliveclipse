package edu.bath.matchmaker.ws;

import edu.bath.matchmaker.Match;
import java.net.URI;
import java.util.Collection;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.wsaddressing.W3CEndpointReference;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
@WebService(targetNamespace=MatchMakerWS.TARGET_NAMESPACE,
    portName=MatchMakerWS.PORT_NAME)
public interface MatchMakerWS {
    String TARGET_NAMESPACE = "http://www.cs.bath.ac.uk/alive";
    String SERVICE_NAME = "MatchMaker";
    String PORT_NAME = "MatchMakerPort";

    @WebMethod void mapDomainOntology(@WebParam(name = "newURI") String newURI, @WebParam(name = "ontologyURI") String ontologyURI);
    
    @WebMethod MatchMakerWS.MatchResult[] performMatch(@WebParam(name = "queryOwls") String queryOwls);

    @WebMethod MatchMakerWS.MatchResult[] performMatchByURL(@WebParam(name = "queryURL") String queryOwls);

    @WebMethod MatchMakerWS.MatchResult[] performSignatureMatch(
        @WebParam(name = "inputs") String[] inputs,
        @WebParam(name = "outputs") String[] outputs
        );

    @WebMethod void registerService(@WebParam(name = "serviceOwls") String serviceOwls);

    @WebMethod void registerServiceByURL(@WebParam(name = "serviceOwlsURL") String serviceOwlsURL);

    public static class MatchResult {
        private URI serviceURI;

        public MatchResult() { }
        public MatchResult(URI serviceOwls) { this.serviceURI = serviceOwls; }

        public URI getService() {
            return serviceURI;
        }

        public void setService(URI serviceURI) {
            this.serviceURI = serviceURI;
        }

        public static MatchMakerWS.MatchResult fromMatch(Match match) {
            return new MatchMakerWS.MatchResult(match.getService().getURI());
        }

        public static MatchMakerWS.MatchResult[] fromMatches(Collection<Match> matches) {
            MatchMakerWS.MatchResult[] array = new MatchMakerWS.MatchResult[matches.size()];
            int pos = 0;
            for (Match m : matches) {
                array[pos++] = fromMatch(m);
            }
            return array;
        }
    }
}