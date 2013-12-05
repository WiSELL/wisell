package wisell.data;

import java.math.BigDecimal;
import java.util.List;

import wisell.model.ChargingMode;
import wisell.model.ChargingRate;

public interface IChargingRateRepository {
	public String create(ChargingRate chargingRate);
	public ChargingRate get(String id);
	public ChargingRate findByModeAndQuantity(ChargingMode mode, Double quantity);
	public BigDecimal getCost(ChargingMode mode, Double quantity);
	public List<ChargingRate> findAll(int offset, int limit);
}
