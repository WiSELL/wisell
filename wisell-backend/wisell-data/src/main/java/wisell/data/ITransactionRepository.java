package wisell.data;

import java.util.Date;
import java.util.List;

import wisell.model.Client;
import wisell.model.Hotspot;
import wisell.model.Transaction;

public interface ITransactionRepository {
	public Transaction get(String id);
	public void recordTransaction(Transaction transaction);
	public void recordTransaction(Hotspot hotspot, Client client, Double duration, Double trafficVolume);
	public List<Transaction> findAll(int offset, int limit);
	public List<Transaction> findByHotspot(Hotspot hotspot);
	public List<Transaction> findByHotspot(Hotspot hotspot, Date startDate, Date endDate);
	public List<Transaction> findByHotspot(Hotspot hotspot, Date startDate, Date endDate, int offset, int limit);
	public List<Transaction> findByClient(Client client);
	public List<Transaction> findByClient(Client client, Date startDate, Date endDate);
	public List<Transaction> findByClient(Client client, Date startDate, Date endDate, int offset, int limit);
}
