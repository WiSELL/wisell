package wisell.data;

import java.util.List;

import wisell.model.Client;

public interface IClientRepository {
	public String create(Client client);
	public void delete(String id);
	public Client get(String id);
	public Client findByPhoneNumber(String phoneNumber);
	public List<Client> findAll(int page, int pageSize);

}
