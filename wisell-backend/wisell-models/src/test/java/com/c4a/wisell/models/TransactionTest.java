/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.models;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author papesdiop
 */
public class TransactionTest extends TestBase {
    
    public TransactionTest() {
        super();
        cleanAfter = false;
    }

    @Test
    public void testCreateTransaction() {
        Query<Client> qc = getDs().find(Client.class).limit(1);
        Query<Hotspot> qh = getDs().find(Hotspot.class).limit(1);
        assertNotNull(qc);
        assertNotNull(qh);
        Key<Transaction> id = getDs().save(new Transaction(qc.getKey(), qh.getKey(), 1259.58, new Date()));
        assertNotNull(id);
    }
    
}
