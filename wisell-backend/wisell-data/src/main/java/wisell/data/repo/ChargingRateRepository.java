package wisell.data.repo;

import java.math.BigDecimal;
import java.util.List;

import org.bson.types.ObjectId;

import wisell.data.IChargingRateRepository;
import wisell.model.BillingMode;
import wisell.model.BillingRate;

public class ChargingRateRepository extends AbstractRepository<BillingRate, ObjectId> implements IChargingRateRepository {

	public String create(BillingRate billingRate) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public BillingRate get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public BillingRate findByModeAndQuantity(BillingMode mode, Double quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getCost(BillingMode mode, Double quantity) {
		// TODO Auto-generated method stub
		return null;
	}	

	public List<BillingRate> findAll(int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getCost(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCost(String id, BigDecimal cost) {
		// TODO Auto-generated method stub
		
	}

	public void update(BillingMode billingMode) {
		// TODO Auto-generated method stub
		
	}

	public void disable(String id) {
		// TODO Auto-generated method stub
		
	}

}
