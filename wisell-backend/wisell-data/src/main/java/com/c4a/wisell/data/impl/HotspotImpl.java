/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.data.impl;

import com.c4a.wisell.data.IHotspot;
import com.c4a.wisell.data.repositories.HotspotDao;
import com.c4a.wisell.models.Connection;
import com.c4a.wisell.models.Hotspot;
import org.mongodb.morphia.Key;

/**
 *
 * @author papesdiop
 */
public class HotspotImpl implements IHotspot{
    HotspotDao dao = new HotspotDao();
    
    public void register(Hotspot hotspot) {
        dao.save(hotspot);
    }

    public void unregister(Hotspot hotspot) {
        dao.delete(hotspot);
    }

    public void start(Hotspot hotspot) {
        Key<Hotspot> key= new Key<Hotspot>(Hotspot.class, hotspot.getId());
        Connection connection = new Connection(null, key, Boolean.TRUE);
        dao.getDatastore().save(connection);
    }

    public void stop(Hotspot hotspot) {
        Key<Hotspot> key= new Key<Hotspot>(Hotspot.class, hotspot.getId());
        Connection connection = new Connection(null, key, Boolean.FALSE);
        dao.getDatastore().save(connection); 
    }

    public void update(Hotspot hotspot) {
        dao.save(hotspot);
    }
    
}
