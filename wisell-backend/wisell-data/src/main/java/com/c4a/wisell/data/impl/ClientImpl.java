/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.data.impl;

import com.c4a.wisell.data.IClient;
import com.c4a.wisell.models.Client;
import com.c4a.wisell.models.Connection;
import com.c4a.wisell.models.Hotspot;
import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author papesdiop
 */
public class ClientImpl implements IClient {


    public void registerClient(Client client) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void registerHotspot(Hotspot hotspot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void connect(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void disconnect(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void register(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void unregister(Client client) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Hotspot> searchingHotspot(Array ClientPosition, Double maxDistance) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
