/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.data;

import com.c4a.wisell.models.Client;
import com.c4a.wisell.models.Connection;
import com.c4a.wisell.models.Hotspot;
import java.util.List;

/**
 *
 * @author papesdiop
 */
public interface IConnection {
    /**
     * Check if client is still connected, The client may power off brutaly for example take off battery
     * @param client
     * @return 
     */
    public boolean isConnected(Client client);
    /**
     * To obtain historic connection for a client
     * @param client
     * @param maxResult number of results to return back
     * @return 
     */
    public List<Connection> getConnectionHistory(Client client, Integer maxResult);
    /**
     * To obtain historic connection for a hotspot
     * @param hotspot 
     * @param maxResult number of results to return back
     * @return 
     */
    public List<Connection> getConnectionHistory(Hotspot hotspot, Integer maxResult);
}
