/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.models;

import com.mongodb.Mongo;
import java.net.UnknownHostException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author papesdiop
 */
public class ClientTest {
    Datastore ds = null;
    
    public ClientTest() throws UnknownHostException {        
        Mongo mongo = new Mongo("localhost");
        ds = new Morphia().createDatastore(mongo, "elk-test");
    }

    @Test
    public void testCreateClient() {
        Key<Client> id = ds.save(new Client("+221-77-942-34-89","1854475558"));
        assertNotNull("Error creating client", id); 
    }

}
