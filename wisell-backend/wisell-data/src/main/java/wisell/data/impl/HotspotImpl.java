/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data.impl;

import javax.inject.Inject;
import wisell.data.IHotspot;
import wisell.models.Connection;
import wisell.models.Hotspot;
import org.mongodb.morphia.Key;
import wisell.data.repo.IHotspotRepository;

/**
 *
 * @author papesdiop
 */
public class HotspotImpl implements IHotspot{
    
    @Inject IHotspotRepository dao;
    
    public void register(final Hotspot hotspot) {
        dao.save(hotspot);
    }

    public void unregister(final Hotspot hotspot) {
        dao.delete(hotspot);
    }

    public void start(final Hotspot hotspot) {
        Key<Hotspot> key= new Key<Hotspot>(Hotspot.class, hotspot.getId());
        Connection connection = new Connection(null, key, Boolean.TRUE);
        dao.getDatastore().save(connection);
    }

    public void stop(final Hotspot hotspot) {
        Key<Hotspot> key= new Key<Hotspot>(Hotspot.class, hotspot.getId());
        Connection connection = new Connection(null, key, Boolean.FALSE);
        dao.getDatastore().save(connection); 
    }

    public void update(final Hotspot hotspot) {
        dao.save(hotspot);
    }
    
}
