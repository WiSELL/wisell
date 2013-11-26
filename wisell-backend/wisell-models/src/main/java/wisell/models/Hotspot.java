/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.models;

import java.util.ArrayList;
import java.util.List;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;

/**
 *
 * @author papesdiop
 */
@Entity(value="hotspots", noClassnameStored=true)
public class Hotspot extends BaseEntity{

    public Hotspot() {
    }

    public Hotspot(String phone, String imei) {
        this.phone = phone;
        this.imei = imei;
    }
    
    public Hotspot(String phone, String imei, String name, String email) {
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
    private String address = null;
    private String tel = null;
    private List<Double> loc = new ArrayList<Double>(); // for geolocation
    private Boolean shareConnection = true; //Allow to share Bandwith
    private Integer maxConnection = 5; // maximal simultaneous connection allowed
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Double> getLoc() {
        return loc;
    }

    public void setLoc(List<Double> loc) {
        this.loc = loc;
    }

    public Boolean isShareConnection() {
        return shareConnection;
    }

    public void setShareConnection(Boolean shareConnection) {
        this.shareConnection = shareConnection;
    }

    public Integer getMaxConnection() {
        return maxConnection;
    }

    public void setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
    }

}
