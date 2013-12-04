/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data;

import wisell.models.Client;
import wisell.models.Hotspot;
import wisell.models.Transaction;
import java.util.List;

/**
 *
 * @author papesdiop
 */
public interface ITransaction {
    /*
    When a client hotspot request for a buying pass
    */
    public void buyingPass(Client client);
    
    /*
    When a hotspot request for a buying pass
    */
    public void buyingPass(Hotspot hotspot);
    /*
    When a client hotspot request for a buying credit
    */
    public void buyingCredit(Hotspot hotspot);
    /**
     * Instruct Telco to deduct @transaction.amount from client after each @delay
     * @param transaction
     * @param delay 
     */
    public void debitClient(Transaction transaction, Double delay);
    
    /**
     * Return transactions list for client
     * @param client
     * @param maxResult
     * @return 
     */
    public List<Transaction> getTransactions(Client client, Integer maxResult);
    
    /**
     * Return transactions list for a hotspot
     * @param hotspot
     * @param maxResult
     * @return 
     */
    public List<Transaction> getTransactions(Hotspot hotspot, Integer maxResult);
}
