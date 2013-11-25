/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.data.impl;

import com.c4a.wisell.data.IClient;
import com.c4a.wisell.data.repositories.ClientDao;
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
    ClientDao dao = new ClientDao();//TODO use CDI

    public void connect(final Connection connection) {
        connection.setStatus(Boolean.TRUE);// ensure it's a true status or return an error
        dao.getDatastore().save(connection);
    }

    public void disconnect(final Connection connection) {
        connection.setStatus(Boolean.FALSE);// ensure it's a false status
        dao.getDatastore().save(connection); 
    }

    public void register(final Client client) {
        dao.save(client);
    }

    public void unregister(final Client client) {
        dao.delete(client);// TODO remove it explicitly or add status unregistered
    }
    
    public List<Hotspot> searchingHotspot(final Array ClientPosition, final Double maxDistance) {
        return dao.getDatastore() //TODO A geolocation request needed
                .find(Hotspot.class)
                .limit(10)
                .asList();
    }
    
}
