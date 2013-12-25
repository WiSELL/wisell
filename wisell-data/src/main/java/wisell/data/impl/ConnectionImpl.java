/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data.impl;

import wisell.data.IConnection;
import wisell.models.Client;
import wisell.models.Connection;
import wisell.models.Hotspot;
import java.util.List;
import javax.inject.Inject;
import wisell.data.repo.IConnectionReposirory;

/**
 *
 * @author papesdiop
 */
public class ConnectionImpl implements IConnection {
    
    @Inject IConnectionReposirory dao;

    public boolean isConnected(final Client client) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Connection> getConnectionHistory(final Client client, final Integer maxResult) {
        return dao.getDatastore()
                .find(Connection.class)
                .filter("client =", client.getId())
                .limit(maxResult)
                .asList(); 
    }

    public List<Connection> getConnectionHistory(final Hotspot hotspot, final Integer maxResult) {
        return dao.getDatastore()
                .find(Connection.class)
                .filter("hotspot =", hotspot.getId())
                .limit(maxResult)
                .asList(); 
    }

    public List<Hotspot> notify(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
