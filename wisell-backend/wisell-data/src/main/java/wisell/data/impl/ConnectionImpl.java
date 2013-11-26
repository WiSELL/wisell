/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data.impl;

import wisell.data.IConnection;
import wisell.models.Client;
import wisell.models.Connection;
import wisell.models.Hotspot;
import java.util.List;

/**
 *
 * @author papesdiop
 */
public class ConnectionImpl implements IConnection {

    public boolean isConnected(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Connection> getConnectionHistory(Client client, Integer maxResult) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Connection> getConnectionHistory(Hotspot hotspot, Integer maxResult) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
