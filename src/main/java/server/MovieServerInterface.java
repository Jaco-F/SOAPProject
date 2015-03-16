package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;

/**
 * Created by Jacopo on 14/02/2015.
 */
@WebService
public interface MovieServerInterface {

    @WebMethod
    public String getJsonFromRottenTomatoes(String movieTitle);
}
