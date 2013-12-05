package wisell.data.repo;

import java.math.BigDecimal;
import java.util.List;

import org.bson.types.ObjectId;

import wisell.data.IChargingRateRepository;
import wisell.model.ChargingMode;
import wisell.model.ChargingRate;

public class ChargingRateRepository extends AbstractRepository<ChargingRate, ObjectId> implements IChargingRateRepository {

	public String create(ChargingRate chargingRate) {
		// TODO Auto-generated method stub
		return null;
	}

	public ChargingRate get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ChargingRate findByModeAndQuantity(ChargingMode mode, Double quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getCost(ChargingMode mode, Double quantity) {
		// TODO Auto-generated method stub
		return null;
	}	

	public List<ChargingRate> findAll(int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
