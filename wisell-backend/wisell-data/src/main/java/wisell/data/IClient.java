/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.data;

import wisell.models.Client;
import wisell.models.Connection;
import wisell.models.Hotspot;
import java.util.List;

/**
 *
 * @author papesdiop
 *
 * Interface that interacts to API web project
 */
public interface IClient {

    /**
     * Client hotspot registration to Wisell
     *
     * @param client
     */
    public void register(Client client);

    /**
     * Client hotspot unregistration from Wisell
     *
     * @param client
     */
    public void unregister(Client client);

    /**
     * Tracking Connection of client to HotSpot
     *
     * @param connection
     */
    public void connect(Connection connection);

    /**
     * Tracking connection of Client to Hotspot
     *
     * @param client
     * @param hotspot
     */
    public void connect(Client client, Hotspot hotspot);

    /**
     * Disconnection of client HotSpot
     *
     * @param connection
     */
    public void disconnect(Connection connection);

    /**
     *
     * @param latitude
     * @param longitude
     * @param maxDistance maximal distance for searching available Hotspot, i.e
     * 100 meters
     * @return
     */
    public List<Hotspot> searchingHotspot(Double latitude, Double longitude, Double maxDistance);
}
