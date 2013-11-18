/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.models;

import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author papesdiop
 */
public class HotspotTest {
    Datastore ds = null;
    
    public HotspotTest() throws UnknownHostException {        
        Mongo mongo = new Mongo("localhost");
        ds = new Morphia().createDatastore(mongo, "elk-test");
    }


    @Test
    public void testCreateHotspot() {
        Key<Hotspot> id = ds.save(new Hotspot("+221-88-88-88-88-01","12887857112", new Date()));
        assertNotNull(id);
    }
    
}
