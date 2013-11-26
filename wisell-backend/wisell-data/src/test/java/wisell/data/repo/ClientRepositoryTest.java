/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo;

import wisell.data.repo.impl.ClientRepository;
import wisell.models.Client;
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
public class ClientRepositoryTest extends TestBase {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(Client.class, ClientRepository.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject ClientRepository dao;// = new ClientRepository();

    public ClientRepositoryTest() {
        super();
        cleanAfter = false;
    }

    @Test
    public void testCreateClient() {
        assertNotNull(dao.save(new Client("101-77-640-84-20", "1854475558","With CDI and Arquillian", "papesdiop@gmail.com")));
    }

}
