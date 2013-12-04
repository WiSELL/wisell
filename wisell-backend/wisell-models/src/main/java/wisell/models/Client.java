/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.models;

import javax.xml.bind.annotation.XmlRootElement;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;

/**
 *
 * @author papesdiop
 */
@Entity(value="clients", noClassnameStored=true)
@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Client extends BaseEntity{

    public Client() {
    }

    public Client(String phone, String imei) {
        this.phone = phone;
        this.imei = imei;
    }

    public Client(String phone, String imei, String name, String email) {
        this.phone = phone;
        this.imei = imei;
        this.name = name;
        this.email = email;
    }
    
    @Indexed
    private String phone; // indexed phone field for better performance
    private String imei;
    private String name = null;
    private String email = null;
    
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the imei
     */
    public String getImei() {
        return imei;
    }

    /**
     * @param imei the imei to set
     */
    public void setImei(String imei) {
        this.imei = imei;
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

   
}
