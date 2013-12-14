package wisell.model;

import java.math.BigDecimal;
import java.util.Date;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;
/**
 * 
 * @author yazid
 *
 */
@Entity(value="transactions")
public class Transaction extends BaseEntity{
	@Reference(lazy=true)
	private Client client;
	private String clientPhoneNumber;
	@Reference(lazy=true)
	private Hotspot hotspot;
	private BigDecimal cost;//cost is calculated by the charging engine
	private BigDecimal resellerRevenue; //revenue earned by reseller based on sharing plan	
	private Double trafficVolume;//volume in KiloBytes
	
	private Double duration; //connection duration; use duration or startDate/endDate
	private Date startDate;
	private Date endDate;
	@Reference(lazy=true)
	BillingRate billingRate;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(Client client, Hotspot hotspot,
			Double trafficVolume, Double duration) {
		super();
		this.client = client;
		this.hotspot = hotspot;
		this.trafficVolume = trafficVolume;
		this.duration = duration;
	}

	public Transaction(String clientPhoneNumber, Double trafficVolume,
			Date startDate, Date endDate) {
		super();
		this.clientPhoneNumber = clientPhoneNumber;
		this.trafficVolume = trafficVolume;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	/**
	 * @return the clientPhoneNumber
	 */
	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}

	/**
	 * @param clientPhoneNumber the clientPhoneNumber to set
	 */
	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}

	
	/**
	 * @return the cost
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	/**
	 * @return the resellerRevenue
	 */
	public BigDecimal getResellerRevenue() {
		return resellerRevenue;
	}

	/**
	 * @param resellerRevenue the resellerRevenue to set
	 */
	public void setResellerRevenue(BigDecimal resellerRevenue) {
		this.resellerRevenue = resellerRevenue;
	}

	/**
	 * @return the trafficVolume
	 */
	public Double getTrafficVolume() {
		return trafficVolume;
	}

	/**
	 * @param trafficVolume the trafficVolume to set
	 */
	public void setTrafficVolume(Double trafficVolume) {
		this.trafficVolume = trafficVolume;
	}

	/**
	 * @return the duration
	 */
	public Double getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Double duration) {
		this.duration = duration;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the hotspot
	 */
	public Hotspot getHotspot() {
		return hotspot;
	}

	/**
	 * @param hotspot the hotspot to set
	 */
	public void setHotspot(Hotspot hotspot) {
		this.hotspot = hotspot;
	}

	/**
	 * @return the billingRate
	 */
	public BillingRate getBillingRate() {
		return billingRate;
	}

	/**
	 * @param billingRate the billingRate to set
	 */
	public void setBillingRate(BillingRate billingRate) {
		this.billingRate = billingRate;
	}
	
}
