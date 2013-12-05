package wisell.model;

import java.math.BigDecimal;

import org.mongodb.morphia.annotations.Entity;

@Entity(value="billratings")
public class ChargingRate extends BaseEntity{
	ChargingMode mode;
	Double quantity;
	BigDecimal price;
	Boolean disable = false;
	
	public ChargingRate() {
		// TODO Auto-generated constructor stub
	}

	public ChargingRate(ChargingMode mode, Double quantity, BigDecimal price) {
		super();
		this.mode = mode;
		this.quantity = quantity;
		this.price = price;
	}

	/**
	 * @return the mode
	 */
	public ChargingMode getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(ChargingMode mode) {
		this.mode = mode;
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
	 * @return the state state of ChargingRate(enable/disable)
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
	
	
}
