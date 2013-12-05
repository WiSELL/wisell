/*
 * Coders4Africa Senegal copyright2013
 */


package wisell.api;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import wisell.data.IConnection;
import wisell.data.repo.IClientRepository;
import wisell.data.repo.IConnectionReposirory;
import wisell.data.repo.IHotspotRepository;
import wisell.models.Client;
import wisell.models.Connection;
import wisell.models.Hotspot;

/**
 *
 * @author papesdiop
 */
@Singleton
@Path("/connections")
public class ConnectionRest {
    @Inject IConnection dao;
    @Inject IConnectionReposirory repo;
    @Inject IClientRepository clientRepo;
    @Inject IHotspotRepository hotspotRepo;
    /**
     * To obtain historic connection for a client
     * @param imei
     * @param maxResult number of results to return back
     * @return 
     */
    @Path("/client/{imei}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Connection> getClientConnectionHistory(@PathParam("imei")String imei, @DefaultValue("5")@QueryParam("limit")Integer maxResult){
        return dao.getConnectionHistory((Client)clientRepo.findOne("imei", imei), maxResult);
    }
    /**
     * To obtain historic connection for a hotspot
     * @param imei 
     * @param maxResult number of results to return back
     * @return 
     */
    @Path("/hotspot/{imei}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Connection> getHotspotConnectionHistory(@PathParam("imei")String imei, @DefaultValue("5")@QueryParam("limit")Integer maxResult){
        return dao.getConnectionHistory((Hotspot)hotspotRepo.findOne("imei", imei), maxResult);
    }
    

}
