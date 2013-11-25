/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.data.impl;

import com.c4a.wisell.data.ITransaction;
import com.c4a.wisell.data.repositories.TransactionDao;
import com.c4a.wisell.models.Client;
import com.c4a.wisell.models.Hotspot;
import com.c4a.wisell.models.Transaction;
import java.util.List;
import javax.inject.Inject;
/**
 *
 * @author papesdiop
 */
public class TransactionImpl implements ITransaction{
    
    @Inject TransactionDao dao; //= new TransactionDao();

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
