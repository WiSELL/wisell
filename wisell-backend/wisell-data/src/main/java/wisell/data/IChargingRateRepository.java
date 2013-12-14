package wisell.data;

import java.math.BigDecimal;
import java.util.List;

import wisell.model.BillingMode;
import wisell.model.BillingRate;

public interface IChargingRateRepository {
	public String create(BillingRate billingRate);
	public BillingRate get(String id);
	public BillingRate findByModeAndQuantity(BillingMode mode, Double quantity);
	public BigDecimal getCost(String id);
	public BigDecimal getCost(BillingMode mode, Double quantity);
	public List<BillingRate> findAll(int offset, int limit);
	public void updateCost(String id, BigDecimal cost);
	public void update(BillingMode billingMode);
	public void disable(String id);
}
