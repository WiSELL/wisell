/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.api;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import wisell.data.ITransaction;
import wisell.data.repo.ITransactionReposirory;
import wisell.models.Client;
import wisell.models.Hotspot;
import wisell.models.Transaction;

/**
 *
 * @author papesdiop
 */
@Singleton
@Path("/transactions")
public class TransactionRest {

    @Inject ITransactionReposirory repo;
    @Inject ITransaction idao;

    /*
     When a client hotspot request for a buying pass
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void buyingPass(Client client) {

    }

    /*
     When a hotspot request for a buying pass
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void buyingPass(Hotspot hotspot){
        
    }
    
    
    /*
     When a client hotspot request for a buying credit
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buyingCredit(Hotspot hotspot, Double amount){
        return null;
    }

    /**
     * Instruct Telco to deduct @transaction.amount from client after each
     * @delay
     *
     * @param clientId
     * @param delay
     */
    @POST
    @Path("/{clientId}/debite")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response debitClient(String clientId, Double delay){
        return null;
    }

    /**
     * Return transactions list for client
     *
     * @param clientId
     * @param maxResult
     * @return
     */
    @Path("/client/{cliendId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getClientTransactions(@PathParam("cliendId")String clientId, Integer maxResult){
        return null;
    }

    /**
     * Return transactions list for a hotspot
     *
     * @param hotspotId
     * @param maxResult
     * @return
     */
    @Path("/hotspot/{hotspotId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getHotspotTransactions(@PathParam("hotspotId")String hotspotId, Integer maxResult){
        return null;
    }
}
