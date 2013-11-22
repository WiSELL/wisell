/*
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.models;

import com.mongodb.DBObject;
import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.PostLoad;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author papesdiop
 */
@Entity("connections")
public class Connection extends BaseEntity {

    public Connection() {
        
    }

    public Connection(Key<Client> client, Key<Hotspot> hotspot) {
        this.client = client;
        this.hotspot = hotspot;
    }

    private Key<Client> client;
    private Key<Hotspot> hotspot;
    private Boolean status = false; // if client is connected or disconnected from hotspot

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

}
