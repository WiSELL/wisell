/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.data;

import com.c4a.wisell.models.Client;
import com.c4a.wisell.models.Connection;
import com.c4a.wisell.models.Hotspot;
import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author papesdiop
 
 Interface that interacts to API web project
 */
public interface IClient {
   
    /**
     * Client hotspot registration to Wisell
     * @param client 
     */
    public void register(Client client);
    /**
     * Client hotspot unregistration from Wisell
     * @param client 
     */
    public void unregister(Client client);
     /**
     *  Connection of client HotSpot
     * @param connection 
     */
    public void connect(Connection connection);
    /**
     *  Disconnection of client HotSpot
     * @param connection 
     */
    public void disconnect(Connection connection);
 
    /**
     * 
     * @param ClientPosition the geolocation position of client
     * @param maxDistance maximal distance for searching available Hotspot, i.e 100 meters
     * @return 
     */
    public List<Hotspot> searchingHotspot(Array ClientPosition, Double maxDistance);
}
