/**
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo.impl;

import wisell.models.Connection;
import java.util.List;

import org.bson.types.ObjectId;
import wisell.data.repo.IConnectionReposirory;

/**
 *
 * @author papesdiop
 */
public class ConnectionRepository extends AbstractRepository<Connection, ObjectId> implements IConnectionReposirory<Connection, ObjectId> {

    public List<Connection> findAll() {
        return ds.find(Connection.class).asList();
    }

}
