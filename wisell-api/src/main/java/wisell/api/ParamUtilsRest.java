/*
 * Coders4Africa Senegal copyright2013
 */


package wisell.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author papesdiop
 */
@Path("/db")
public class ParamUtilsRest {
    String host = System.getenv("OPENSHIFT_MONGODB_DB_HOST");
    String sport = System.getenv("OPENSHIFT_MONGODB_DB_PORT");
    String dbName = System.getenv("OPENSHIFT_APP_NAME");
    String user = System.getenv("OPENSHIFT_MONGODB_DB_USERNAME");
    String password = System.getenv("OPENSHIFT_MONGODB_DB_PASSWORD");
    
    @GET
    @Path("/host")
    @Produces({MediaType.APPLICATION_JSON})
    public String host(){
        
        return "{host: " + host +
                ", port: " + sport +
                ", dbName: " + dbName +
                ", user: " + user +
                ", password: " + password + "}";
    }
}
