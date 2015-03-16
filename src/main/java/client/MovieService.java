
package client;

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
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieService", targetNamespace = "http://impl.server/", wsdlLocation = "http://localhost:9000/services/MovieService?wsdl")
public class MovieService
    extends Service
{

    private final static URL MOVIESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESERVICE_EXCEPTION;
    private final static QName MOVIESERVICE_QNAME = new QName("http://impl.server/", "MovieService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/services/MovieService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESERVICE_WSDL_LOCATION = url;
        MOVIESERVICE_EXCEPTION = e;
    }

    public MovieService() {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME);
    }

    public MovieService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME, features);
    }

    public MovieService(URL wsdlLocation) {
        super(wsdlLocation, MOVIESERVICE_QNAME);
    }

    public MovieService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESERVICE_QNAME, features);
    }

    public MovieService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieServerInterface
     */
    @WebEndpoint(name = "MovieServerImplPort")
    public MovieServerInterface getMovieServerImplPort() {
        return super.getPort(new QName("http://impl.server/", "MovieServerImplPort"), MovieServerInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieServerInterface
     */
    @WebEndpoint(name = "MovieServerImplPort")
    public MovieServerInterface getMovieServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.server/", "MovieServerImplPort"), MovieServerInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESERVICE_EXCEPTION!= null) {
            throw MOVIESERVICE_EXCEPTION;
        }
        return MOVIESERVICE_WSDL_LOCATION;
    }

}