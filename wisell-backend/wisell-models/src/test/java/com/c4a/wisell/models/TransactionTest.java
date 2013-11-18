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
import org.mongodb.morphia.query.Query;

/**
 *
 * @author papesdiop
 */
public class TransactionTest {
    Datastore ds = null;
    
    public TransactionTest() throws UnknownHostException {
        Mongo mongo = new Mongo("localhost");
        ds = new Morphia().createDatastore(mongo, "elk-test");
    }

    @Test
    public void testCreateTransaction() {
        Query<Client> qc = ds.find(Client.class).limit(1);
        Query<Hotspot> qh = ds.find(Hotspot.class).limit(1);
        //Client client = qc.asList().get(0);
        Key<Transaction> id = ds.save(new Transaction(qc.getKey(),qh.getKey(), 1259.58, new Date()));
        assertNotNull(id);
    }
    
}
