package server.deploy;

import server.impl.MovieServerImpl;
import javax.xml.ws.Endpoint;

/**
 * Created by Jacopo on 14/02/2015.
 */
public class Publisher {
    public static void main(String[] argv) {
        Object implementor = new MovieServerImpl();
        String address = "http://localhost:9000/services/MovieService";
        Endpoint.publish(address, implementor);
    }
}
