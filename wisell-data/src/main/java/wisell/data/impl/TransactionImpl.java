/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data.impl;

import wisell.data.ITransaction;
import wisell.data.repo.impl.TransactionRepository;
import wisell.models.Client;
import wisell.models.Hotspot;
import wisell.models.Transaction;
import java.util.List;
import javax.inject.Inject;
/**
 *
 * @author papesdiop
 */
public class TransactionImpl implements ITransaction{
    
    @Inject TransactionRepository dao;

    public void buyingPass(final String imei) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void buyingPass(final Client client) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void buyingPass(final Hotspot hotspot) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void buyingCredit(final Hotspot hotspot) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
     public void buyingCredit(final String imei) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void debitClient(final Transaction transaction, final Double delay) {
        dao.save(transaction); 
    }

    public List<Transaction> getTransactions(final Client client, final Integer maxResult) {
        return dao.getDatastore()
                .find(Transaction.class)
                .filter("client =", client.getId())
                .limit(maxResult)
                .asList();
    }

    public List<Transaction> getTransactions(final Hotspot hotspot, final Integer maxResult) {
        return dao.getDatastore()
                .find(Transaction.class)
                .filter("client =", hotspot.getId())
                .limit(maxResult)
                .asList();
    }
    
    public List<Transaction> getTransactions(String imei, Integer maxResult){
        return dao.getDatastore()
                .find(Transaction.class)
                .field("client").equal(imei)
                .field("hotspot").equal(imei)//TODO
                .limit(maxResult)
                .asList();
    }
    
}
