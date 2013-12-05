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
import wisell.data.ITransaction;
import wisell.data.repo.ITransactionReposirory;
import wisell.models.Transaction;

/**
 *
 * @author papesdiop
 */
@Singleton
@Path("/transactions")
public class TransactionRest {

    @Inject ITransactionReposirory repo;
    @Inject ITransaction dao;

    /**
     When a client hotspot request for a buying pass
     * @param imei
     * @return 
     */
    @Path("/buypass/{imei}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buyingPass(@PathParam("imei")String imei) {
        dao.buyingPass(imei);
        return Response.ok().build();
    }

    
    /**
     When a client hotspot request for a buying credit
     * @param imei
     * @param amount
     * @return 
     */
    @Path("/buycredit/{imei}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buyingCredit(@PathParam("imei")String imei, Double amount){
        dao.buyingCredit(imei);
        return Response.ok().build();
    }

    /**
     * Instruct Telco to deduct @transaction.amount from client after each
     * @delay
     *
     * @param imei
     * @param delay
     */
    @POST
    @Path("/{imei}/debite")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response debitClient(@PathParam("imei")String imei, Double delay){
        return Response.ok().build();
    }

    /**
     * Return transactions list for client
     *
     * @param imei
     * @param maxResult
     * @return
     */
    @Path("/{imei}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getClientTransactions(@PathParam("imei")String imei, @DefaultValue("10")@QueryParam("limit")Integer maxResult){
        return dao.getTransactions(imei, maxResult);
    }
}
