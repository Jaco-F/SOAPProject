
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetJsonFromRottenTomatoes_QNAME = new QName("http://server/", "getJsonFromRottenTomatoes");
    private final static QName _GetJsonFromRottenTomatoesResponse_QNAME = new QName("http://server/", "getJsonFromRottenTomatoesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetJsonFromRottenTomatoesResponse }
     * 
     */
    public GetJsonFromRottenTomatoesResponse createGetJsonFromRottenTomatoesResponse() {
        return new GetJsonFromRottenTomatoesResponse();
    }

    /**
     * Create an instance of {@link GetJsonFromRottenTomatoes }
     * 
     */
    public GetJsonFromRottenTomatoes createGetJsonFromRottenTomatoes() {
        return new GetJsonFromRottenTomatoes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJsonFromRottenTomatoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getJsonFromRottenTomatoes")
    public JAXBElement<GetJsonFromRottenTomatoes> createGetJsonFromRottenTomatoes(GetJsonFromRottenTomatoes value) {
        return new JAXBElement<GetJsonFromRottenTomatoes>(_GetJsonFromRottenTomatoes_QNAME, GetJsonFromRottenTomatoes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJsonFromRottenTomatoesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getJsonFromRottenTomatoesResponse")
    public JAXBElement<GetJsonFromRottenTomatoesResponse> createGetJsonFromRottenTomatoesResponse(GetJsonFromRottenTomatoesResponse value) {
        return new JAXBElement<GetJsonFromRottenTomatoesResponse>(_GetJsonFromRottenTomatoesResponse_QNAME, GetJsonFromRottenTomatoesResponse.class, null, value);
    }

}
