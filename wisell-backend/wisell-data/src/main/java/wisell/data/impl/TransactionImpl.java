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
    
    @Inject TransactionRepository dao; //= new TransactionRepository();

    public void buyingPass(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void buyingPass(Hotspot hotspot) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void buyingCredit(Hotspot hotspot) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void debitClient(Transaction transaction, Double delay) {
        dao.save(transaction); 
    }

    public List<Transaction> getTransactions(Client client, Integer maxResult) {
        return dao.getDatastore()
                .find(Transaction.class)
                .filter("client =", client.getId())
                .limit(maxResult)
                .asList();
    }

    public List<Transaction> getTransactions(Hotspot hotspot, Integer maxResult) {
        return dao.getDatastore()
                .find(Transaction.class)
                .filter("client =", hotspot.getId())
                .limit(maxResult)
                .asList();
    }
    
}
