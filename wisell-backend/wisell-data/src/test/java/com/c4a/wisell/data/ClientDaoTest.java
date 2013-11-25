/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c4a.wisell.data;

import com.c4a.wisell.data.repositories.AbstractDao;
import com.c4a.wisell.data.repositories.ClientDao;
import com.c4a.wisell.models.Client;
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author papesdiop
 */

@RunWith(Arquillian.class)
public class ClientDaoTest extends TestBase {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(Client.class, ClientDao.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject ClientDao dao;// = new ClientDao();

    public ClientDaoTest() {
        super();
        cleanAfter = false;
    }

    @Test
    public void testCreateClient() {
        assertNotNull(dao.save(new Client("101-77-640-84-20", "1854475558","With CDI and Arquillian", "papesdiop@gmail.com")));
    }

}
