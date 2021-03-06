/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.models;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author papesdiop
 */
@Entity("connections")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Connection extends BaseEntity {

    public Connection() {
        
    }

    public Connection(Key<Client> client, Key<Hotspot> hotspot, Boolean status) {
        this.client = client;
        this.hotspot = hotspot;
        this.status = status;
    }

    private Key<Client> client;
    private Key<Hotspot> hotspot;
    private Boolean status = false; // if client is connected or disconnected from hotspot
    private Double bandwith = null; 

    @Property("dateClient")
    private Date dateClient = null;

    public Key<Client> getClient() {
        return client;
    }

    public void setClient(Key<Client> client) {
        this.client = client;
    }

    public Key<Hotspot> getHotspot() {
        return hotspot;
    }

    public void setHotspot(Key<Hotspot> hotspot) {
        this.hotspot = hotspot;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDateClient() {
        return dateClient;
    }

    public void setDateClient(Date dateClient) {
        this.dateClient = dateClient;
    }

    public Double getBandwith() {
        return bandwith;
    }

    public void setBandwith(Double bandwith) {
        this.bandwith = bandwith;
    }

}
