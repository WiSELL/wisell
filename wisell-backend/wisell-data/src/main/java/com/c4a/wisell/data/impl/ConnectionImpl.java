/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.data.impl;

import com.c4a.wisell.data.IConnection;
import com.c4a.wisell.models.Client;
import com.c4a.wisell.models.Connection;
import com.c4a.wisell.models.Hotspot;
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
