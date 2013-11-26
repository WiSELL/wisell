/*
 * Coders4Africa Senegal copyright2013
 */

package com.c4a.wisell.models;

import wisell.models.Client;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Key;

/**
 *
 * @author papesdiop
 */
public class ClientTest extends TestBase {
    
    public ClientTest(){ 
        super();
        cleanAfter = false;
    }

    @Test
    public void testCreateClient() {
        Key<Client> id =  getDs().save(new Client("+221-77-942-34-89","1854475558"));
        assertNotNull("Error creating client", id); 
    }

}
