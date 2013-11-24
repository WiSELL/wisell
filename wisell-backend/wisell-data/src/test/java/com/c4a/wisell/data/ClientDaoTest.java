/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.c4a.wisell.data;

import com.c4a.wisell.data.repositories.ClientDao;
import com.c4a.wisell.models.Client;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author papesdiop
 */
public class ClientDaoTest extends TestBase{
    
    ClientDao dao = new ClientDao();
    
    public ClientDaoTest() {
        super();
        cleanAfter = false;
    }

    @Test
    public void testCreateClient() {
        assertNotNull(dao.save(new Client("101-77-640-84-20","1854475558")));
    }
    
}
