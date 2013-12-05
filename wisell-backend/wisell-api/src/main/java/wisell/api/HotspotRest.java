/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.api;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import wisell.data.IHotspot;
import wisell.data.repo.IHotspotRepository;
import wisell.models.Hotspot;

/**
 *
 * @author papesdiop
 */
@Singleton
@Path("/hotspots")
public class HotspotRest {
    @Inject IHotspotRepository hotspotRepo;
    @Inject IHotspot dao;
    
    /**
     * Register a hotspot to wisell
     * @param hotspot 
     * @return  
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(Hotspot hotspot){
        dao.register(hotspot);
        return Response.ok().build();
    }

    /**
     * Unregister a hotspot from wisell
     * @param imei 
     * @return  
     */
    @Path("/{imei}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response unregister(@PathParam("imei")String imei){
        dao.unregister((Hotspot) hotspotRepo.findOne("phone", imei));
        return Response.ok().build();
    }
    /**
     * Tracking Starting hotspot, Hotspot have to obtain an available pass before starting
     * @param imei 
     * @return  
     */
    @Path("/start/{imei}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response start(@PathParam("imei")String imei){
        dao.start(imei);
        return Response.ok().build();
    }
    
    /**
     * Tracking a Stoping hotspot
     * @param imei 
     * @return  
     */
    @Path("/stop/{imei}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response stop(@PathParam("imei")String imei){
        dao.stop(imei);
        return Response.ok().build();
}
    /**
     * Updating hotspot settings (share bandwith, maximal simultaneous connections, etc.)
     * @param hotspot 
     * @param imei 
     * @return  
     */
    @Path("/{imei}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Hotspot hotspot, @PathParam("imei")String imei){
        dao.update(hotspot);
        return Response.ok().build();
    }
}
