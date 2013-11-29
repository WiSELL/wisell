/**
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo.impl;

import wisell.models.Client;
import java.util.List;
import javax.enterprise.inject.Default;

import org.bson.types.ObjectId;
import wisell.data.repo.IClientRepository;

/**
 *
 * @author papesdiop
 */
@Default
public class ClientRepository extends AbstractRepository<Client, ObjectId> implements IClientRepository<Client, ObjectId>  {

    public List<Client> findAll() {
        return ds.find(Client.class).asList();
    }

    public List<Client> findByPhone(String phone) {
        return ds.find(Client.class).filter("phone = ", phone)
                .order("phone").asList();
    }

}
