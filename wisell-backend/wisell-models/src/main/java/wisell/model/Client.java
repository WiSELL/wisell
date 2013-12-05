package wisell.model;

import org.mongodb.morphia.annotations.Entity;
/**
 * 
 * @author yazid
 *
 */
@Entity(value="clients")
public class Client extends BaseEntity{
	private String phoneNumber;
	private String phoneIMEI;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String phoneNumber, String phoneIMEI) {
		super();
		this.phoneNumber = phoneNumber;
		this.phoneIMEI = phoneIMEI;
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
	
	
}
