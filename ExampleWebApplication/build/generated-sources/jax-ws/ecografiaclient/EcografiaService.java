
package ecografiaclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EcografiaService", targetNamespace = "http://dmas.dfki.de/axis/services/Ecografia", wsdlLocation = "http://localhost:8080/ExampleWebApplication/EcografiaService?wsdl")
public class EcografiaService
    extends Service
{

    private final static URL ECOGRAFIASERVICE_WSDL_LOCATION;
    private final static WebServiceException ECOGRAFIASERVICE_EXCEPTION;
    private final static QName ECOGRAFIASERVICE_QNAME = new QName("http://dmas.dfki.de/axis/services/Ecografia", "EcografiaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ExampleWebApplication/EcografiaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECOGRAFIASERVICE_WSDL_LOCATION = url;
        ECOGRAFIASERVICE_EXCEPTION = e;
    }

    public EcografiaService() {
        super(__getWsdlLocation(), ECOGRAFIASERVICE_QNAME);
    }

    public EcografiaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECOGRAFIASERVICE_QNAME, features);
    }

    public EcografiaService(URL wsdlLocation) {
        super(wsdlLocation, ECOGRAFIASERVICE_QNAME);
    }

    public EcografiaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECOGRAFIASERVICE_QNAME, features);
    }

    public EcografiaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EcografiaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EcografiaPortType
     */
    @WebEndpoint(name = "EcografiaPort")
    public EcografiaPortType getEcografiaPort() {
        return super.getPort(new QName("http://dmas.dfki.de/axis/services/Ecografia", "EcografiaPort"), EcografiaPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EcografiaPortType
     */
    @WebEndpoint(name = "EcografiaPort")
    public EcografiaPortType getEcografiaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dmas.dfki.de/axis/services/Ecografia", "EcografiaPort"), EcografiaPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECOGRAFIASERVICE_EXCEPTION!= null) {
            throw ECOGRAFIASERVICE_EXCEPTION;
        }
        return ECOGRAFIASERVICE_WSDL_LOCATION;
    }

}