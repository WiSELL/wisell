package wisell.data.repo;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import wisell.data.ITransactionRepository;
import wisell.model.Client;
import wisell.model.Hotspot;
import wisell.model.Transaction;

public class TransactionRepository extends AbstractRepository<Transaction, ObjectId>  implements ITransactionRepository{

	public Transaction get(String id) {
		return get(new ObjectId(id));
	}

	public void recordTransaction(Transaction transaction) {
		save(transaction);
		
	}

	public void recordTransaction(Hotspot hotspot, Client client,
			Double duration, Double trafficVolume) {
		
		Transaction transaction = new Transaction(client, hotspot, trafficVolume, duration);
		save(transaction);
		
	}

	public List<Transaction> findAll(int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByHotspot(Hotspot hotspot) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByHotspot(Hotspot hotspot, Date startDate,
			Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByHotspot(Hotspot hotspot, Date startDate,
			Date endDate, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByClient(Client client, Date startDate,
			Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByClient(Client client, Date startDate,
			Date endDate, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
