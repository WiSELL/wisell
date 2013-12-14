package wisell.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;

/**
 * 
 * @author yazid
 */
@Entity(value="hotspots")
public class Hotspot extends BaseEntity{
	@Indexed
	private String phoneNumber;
	private String phoneIMEI;
	private String password;
	private String hotspotSSID;
	private String resellerFirstName;
	private String resellerLastName;
	private String resellerAddress;
	private Boolean locked = false;
	
	public Hotspot() {
		
	}
	public Hotspot(String phoneNumber, String phoneIMEI, String password,
			String resellerFirstName, String resellerLastName,
			String resellerAddress) {
		super();
		this.phoneNumber = phoneNumber;
		this.phoneIMEI = phoneIMEI;
		this.password = password;
		this.resellerFirstName = resellerFirstName;
		this.resellerLastName = resellerLastName;
		this.resellerAddress = resellerAddress;
	}

	public Hotspot(String phoneNumber, String phoneIMEI, String password) {
		super();
		this.phoneNumber = phoneNumber;
		this.phoneIMEI = phoneIMEI;
		this.password = password;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the phoneIMEI
	 */
	public String getPhoneIMEI() {
		return phoneIMEI;
	}

	/**
	 * @param phoneIMEI the phoneIMEI to set
	 */
	public void setPhoneIMEI(String phoneIMEI) {
		this.phoneIMEI = phoneIMEI;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the resellerFirstName
	 */
	public String getResellerFirstName() {
		return resellerFirstName;
	}

	/**
	 * @param resellerFirstName the resellerFirstName to set
	 */
	public void setResellerFirstName(String resellerFirstName) {
		this.resellerFirstName = resellerFirstName;
	}

	/**
	 * @return the resellerLastName
	 */
	public String getResellerLastName() {
		return resellerLastName;
	}

	/**
	 * @param resellerLastName the resellerLastName to set
	 */
	public void setResellerLastName(String resellerLastName) {
		this.resellerLastName = resellerLastName;
	}

	/**
	 * @return the resellerAddress
	 */
	public String getResellerAddress() {
		return resellerAddress;
	}

	/**
	 * @param resellerAddress the resellerAddress to set
	 */
	public void setResellerAddress(String resellerAddress) {
		this.resellerAddress = resellerAddress;
	}

	/**
	 * @return the locked
	 */
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * @param locked the locked to set
	 */
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	/**
	 * @return the hotspotSSID
	 */
	public String getHotspotSSID() {
		return hotspotSSID;
	}
	/**
	 * @param hotspotSSID the hotspotSSID to set
	 */
	public void setHotspotSSID(String hotspotSSID) {
		this.hotspotSSID = hotspotSSID;
	}	
		
}
