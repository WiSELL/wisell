/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.models;

import wisell.models.Hotspot;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Key;

/**
 *
 * @author papesdiop
 */
public class HotspotTest extends TestBase {
    
    public HotspotTest() {  
        super();
        cleanAfter = false;
    }


    @Test
    public void testCreateHotspot() {
        Key<Hotspot> id = getDs().save(new Hotspot("+221-88-88-88-88-01","12887857112"));
        assertNotNull(id);
    }
    
}
