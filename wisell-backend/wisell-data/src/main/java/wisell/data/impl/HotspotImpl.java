/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data.impl;

import wisell.data.IHotspot;
import wisell.data.repo.impl.HotspotRepository;
import wisell.models.Connection;
import wisell.models.Hotspot;
import org.mongodb.morphia.Key;

/**
 *
 * @author papesdiop
 */
public class HotspotImpl implements IHotspot{
    HotspotRepository dao = new HotspotRepository();
    
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
