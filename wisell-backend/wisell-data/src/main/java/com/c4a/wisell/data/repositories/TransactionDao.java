/**
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.data.repositories;

import com.c4a.wisell.models.Transaction;
import java.util.List;

import org.bson.types.ObjectId;

/**
 *
 * @author papesdiop
 */
public class TransactionDao extends AbstractDao<Transaction, ObjectId> {

    public List<Transaction> findAll() {
        return ds.find(Transaction.class).asList();
    }

}
