/*
 * Coders4Africa Senegal copyright2013
 */


package wisell.api;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import wisell.data.IConnection;
import wisell.data.repo.IConnectionReposirory;
import wisell.models.Connection;

/**
 *
 * @author papesdiop
 */
@Singleton
@Path("/connections")
public class ConnectionRest {
    @Inject IConnection idao;
    @Inject IConnectionReposirory repo;
    /**
     * To obtain historic connection for a client
     * @param clientId
     * @param maxResult number of results to return back
     * @return 
     */
    @Path("/client/{clientId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Connection> getClientConnectionHistory(String clientId, Integer maxResult){
        return null;
    }
    /**
     * To obtain historic connection for a hotspot
     * @param hotspotId 
     * @param maxResult number of results to return back
     * @return 
     */
    @Path("/hotspot/{hotspotId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Connection> getHotspotConnectionHistory(String hotspotId, Integer maxResult){
        return null;
    }
    

}
