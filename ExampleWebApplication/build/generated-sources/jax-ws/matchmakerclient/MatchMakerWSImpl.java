
package matchmakerclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MatchMakerWSImpl", targetNamespace = "http://www.cs.bath.ac.uk/alive")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MatchMakerWSImpl {


    /**
     * 
     * @param serviceOwls
     */
    @WebMethod
    @RequestWrapper(localName = "registerService", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.RegisterService")
    @ResponseWrapper(localName = "registerServiceResponse", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.RegisterServiceResponse")
    @Action(input = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/registerServiceRequest", output = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/registerServiceResponse")
    public void registerService(
        @WebParam(name = "serviceOwls", targetNamespace = "")
        String serviceOwls);

    /**
     * 
     * @param serviceOwls
     */
    @WebMethod
    @RequestWrapper(localName = "registerServiceByURL", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.RegisterServiceByURL")
    @ResponseWrapper(localName = "registerServiceByURLResponse", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.RegisterServiceByURLResponse")
    @Action(input = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/registerServiceByURLRequest", output = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/registerServiceByURLResponse")
    public void registerServiceByURL(
        @WebParam(name = "serviceOwls", targetNamespace = "")
        String serviceOwls);

    /**
     * 
     * @param queryOwls
     * @return
     *     returns java.util.List<matchmakerclient.MatchResult>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "performMatch", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.PerformMatch")
    @ResponseWrapper(localName = "performMatchResponse", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.PerformMatchResponse")
    @Action(input = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/performMatchRequest", output = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/performMatchResponse")
    public List<MatchResult> performMatch(
        @WebParam(name = "queryOwls", targetNamespace = "")
        String queryOwls);

    /**
     * 
     * @param inputs
     * @param outputs
     * @return
     *     returns java.util.List<matchmakerclient.MatchResult>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "performSignatureMatch", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.PerformSignatureMatch")
    @ResponseWrapper(localName = "performSignatureMatchResponse", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.PerformSignatureMatchResponse")
    @Action(input = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/performSignatureMatchRequest", output = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/performSignatureMatchResponse")
    public List<MatchResult> performSignatureMatch(
        @WebParam(name = "inputs", targetNamespace = "")
        List<String> inputs,
        @WebParam(name = "outputs", targetNamespace = "")
        List<String> outputs);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "mapDomainOntology", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.MapDomainOntology")
    @ResponseWrapper(localName = "mapDomainOntologyResponse", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.MapDomainOntologyResponse")
    @Action(input = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/mapDomainOntologyRequest", output = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/mapDomainOntologyResponse")
    public void mapDomainOntology(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param queryOwls
     * @return
     *     returns java.util.List<matchmakerclient.MatchResult>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "performMatchByURL", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.PerformMatchByURL")
    @ResponseWrapper(localName = "performMatchByURLResponse", targetNamespace = "http://www.cs.bath.ac.uk/alive", className = "matchmakerclient.PerformMatchByURLResponse")
    @Action(input = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/performMatchByURLRequest", output = "http://www.cs.bath.ac.uk/alive/MatchMakerWSImpl/performMatchByURLResponse")
    public List<MatchResult> performMatchByURL(
        @WebParam(name = "queryOwls", targetNamespace = "")
        String queryOwls);

}