package wisell.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;
/**
 * 
 * @author yazid
 *
 */
@Entity(value="clients", noClassnameStored=true)
public class Client extends BaseEntity{
	@Indexed
	private String phoneNumber;
	private String phoneIMEI;
	private String email=null;
	private String name=null;
	
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	
	
	
}
