/**
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo.impl;

import wisell.models.Transaction;
import java.util.List;

import org.bson.types.ObjectId;
import wisell.data.repo.ITransactionReposirory;

/**
 *
 * @author papesdiop
 */
public class TransactionRepository extends AbstractRepository<Transaction, ObjectId> implements ITransactionReposirory<Transaction, ObjectId>{

    public List<Transaction> findAll() {
        return ds.find(Transaction.class).asList();
    }

}
