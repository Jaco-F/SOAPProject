
package client;

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
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MovieServerInterface", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieServerInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getJsonFromRottenTomatoes", targetNamespace = "http://server/", className = "client.GetJsonFromRottenTomatoes")
    @ResponseWrapper(localName = "getJsonFromRottenTomatoesResponse", targetNamespace = "http://server/", className = "client.GetJsonFromRottenTomatoesResponse")
    @Action(input = "http://server/MovieServerInterface/getJsonFromRottenTomatoesRequest", output = "http://server/MovieServerInterface/getJsonFromRottenTomatoesResponse")
    public String getJsonFromRottenTomatoes(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
