package wisell.model;

import java.math.BigDecimal;

import org.mongodb.morphia.annotations.Entity;

@Entity(value="billratings")
public class BillingRate extends BaseEntity{
	private BillingMode billingMode;
	private Double quantity;
	private BigDecimal price;
	private Boolean disable = false;
	private Double resellerSharingPercentage; // reseller percentage revenue on transaction ex=0.01
	
	public BillingRate() {
		// TODO Auto-generated constructor stub
	}

	public BillingRate(BillingMode billingMode, Double quantity, BigDecimal price) {
		super();
		this.billingMode = billingMode;
		this.quantity = quantity;
		this.price = price;
	}

	/**
	 * @return the billingMode
	 */
	public BillingMode getBillingMode() {
		return billingMode;
	}

	/**
	 * @param billingMode the billingMode to set
	 */
	public void setBillingMode(BillingMode mode) {
		this.billingMode = mode;
	}

	/**
	 * @return the quantity
	 */
	public Double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the state state of BillingRate(enable/disable)
	 */
	public Boolean isDisable() {
		return disable;
	}

	/**
	 * @param disable the disable to set
	 */
	public void setDisable(Boolean disable) {
		this.disable = disable;
	}

	/**
	 * @return the resellerSharingPercentage
	 */
	public Double getResellerSharingPercentage() {
		return resellerSharingPercentage;
	}

	/**
	 * @param resellerSharingPercentage the resellerSharingPercentage to set
	 */
	public void setResellerSharingPercentage(Double resellerSharingPercentage) {
		this.resellerSharingPercentage = resellerSharingPercentage;
	}
	
	
}
