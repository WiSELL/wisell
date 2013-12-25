/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo;

import wisell.models.Connection;
import java.util.List;

/**
 *
 * @author papesdiop
 */
public interface IConnectionReposirory<E, K>  extends org.mongodb.morphia.dao.DAO<E, K> {
    public List<Connection> findAll();
}
