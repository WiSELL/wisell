/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data.impl;

import wisell.data.IClient;
import wisell.models.Client;
import wisell.models.Connection;
import wisell.models.Hotspot;
import java.lang.reflect.Array;
import java.util.List;
import javax.inject.Inject;
import org.mongodb.morphia.Key;
import wisell.data.repo.IClientRepository;

/**
 *
 * @author papesdiop
 */
public class ClientImpl implements IClient {
    @Inject IClientRepository dao;

    public void connect(final Connection connection) {
        connection.setStatus(Boolean.TRUE);// ensure it's a true status or return an error
        dao.getDatastore().save(connection);
    }
    
    public void connect(final Client client, final Hotspot hotspot) {
        Key<Client> kClient = new Key<Client>(Client.class, client.getId());
        Key<Hotspot> kHotspot = new Key<Hotspot>(Hotspot.class, hotspot.getId());
        Connection connection = new Connection(kClient, kHotspot, Boolean.TRUE);
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
