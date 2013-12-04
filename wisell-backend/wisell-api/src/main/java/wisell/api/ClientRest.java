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
import wisell.data.repo.IClientRepository;
import wisell.models.Client;

/**
 *
 * @author papesdiop
 */

@Path("/clients")
@Singleton
public class ClientRest {
    @Inject IClientRepository repo;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON/*, MediaType.APPLICATION_XML*/})
    public List<Client> findAllClients(){
        return repo
                .getDatastore()
                .find(Client.class)
                .limit(10).asList();
    }
}
