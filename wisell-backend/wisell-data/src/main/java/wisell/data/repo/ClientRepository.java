package wisell.data.repo;

import java.util.List;

import org.bson.types.ObjectId;

import wisell.data.IClientRepository;
import wisell.model.Client;

public class ClientRepository extends AbstractRepository<Client, ObjectId>
		implements IClientRepository {

	public String create(Client client) {
		return (String) ds.save(client).getId();
	}

	public void delete(String id) {
		deleteById(new ObjectId(id));
	}

	public Client get(String id) {
		return get(new ObjectId(id));
	}

	public Client findByPhoneNumber(String phoneNumber) {
		return ds.find(getEntityClass()).filter("phoneNumber =", phoneNumber)
				.get();
	}

	public List<Client> findAll(int page, int pageSize) {
		return ds.find(getEntityClass()).offset(page).limit(pageSize).asList();

	}

	public void update(Client client) {
		// TODO Auto-generated method stub
		
	}

}
