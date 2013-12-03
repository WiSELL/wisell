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
@Entity(value="transactions", noClassnameStored=true)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Transaction extends BaseEntity {

    public Transaction() {
    }

    public Transaction(Key<Client> client, Key<Hotspot> hotspot, Double amount, Date dateClient) {
        this.client = client;
        this.hotspot = hotspot;
        this.amount = amount;
        this.dateClient = dateClient;
    }

   
    //@Reference Client clientRef;
    private Key<Client> client;
    private Key<Hotspot> hotspot;
    private Double amount;
    
    @Property("dateClient")
    private Date dateClient;

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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDateClient() {
        return dateClient;
    }

    public void setDateClient(Date dateClient) {
        this.dateClient = dateClient;
    }
}
