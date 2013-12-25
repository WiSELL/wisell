/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo;

import wisell.models.Transaction;
import java.util.List;

/**
 *
 * @author papesdiop
 */
public interface ITransactionReposirory<E, K>  extends org.mongodb.morphia.dao.DAO<E, K> {
    public List<Transaction> findAll();
}
