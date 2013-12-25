/*
 * Coders4Africa Senegal copyright2013
 */


package wisell.api;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import wisell.data.IClient;
import wisell.data.repo.IClientRepository;
import wisell.models.Client;
import wisell.models.Hotspot;

/**
 *
 * @author papesdiop
 */

@Path("/clients")
@Singleton
public class ClientRest {
    @Inject IClientRepository repo;
    @Inject IClient dao;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Client> findClients(@DefaultValue("10") @QueryParam("limit") int limit){
        return repo
                .getDatastore()
                .find(Client.class)
                .limit(limit).asList();
    }
    
    /**
     * Client hotspot registration to Wisell
     * @param client
     * @return 
     */
    @Path("/register")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(Client client){
        dao.register(client);
        return Response.ok().build();
    }

    /**
     * Client hotspot unregistration from Wisell
     * @param phone
     * @return 
     */
    @Path("/unregister/{phone}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response unregister(@PathParam("phone")String phone){
        dao.unregister((Client) repo.findOne("phone", phone));
        return Response.ok().build();
    }
    
    /**
     * Tracking connection of Client to Hotspot
     * @param phone
     * @param hotspot
     * @return 
     */
    @Path("/connect/{phone}/{hotspotId}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response connect(@PathParam("phone")String phone, @PathParam("hotspotId")String hotspot){
        dao.connect(phone, hotspot);
        return Response.ok().build();
    }

    /**
     * Disconnection of client HotSpot
     *
     * @param phone
     * @param hotspot
     * @return 
     */
    @Path("/connect/{phone}/{hotspotId}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response disconnect(@PathParam("phone")String phone, @PathParam("hotspotId")String hotspot){
        
        return Response.ok().build();
    }

    /**
     * @param latitude
     * @param longitude
     * @param maxDistance maximal distance for searching available Hotspot, i.e
     * 100 meters
     * @return
     */
    @Path("/geonear")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hotspot> searchingHotspot(@QueryParam("lat")Double latitude, @QueryParam("lon")Double longitude, @QueryParam("radius")Double maxDistance){
        return dao.searchingHotspot(latitude, longitude, maxDistance);
    }
}
