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
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author papesdiop
 */
@Entity(value="transactions", noClassnameStored=true)
public class Transaction {

    public Transaction() {
    }

    public Transaction(Key<Client> client, Key<Hotspot> hotspot, Double amount, Date createdAt, Date dateClient) {
        this.client = client;
        this.hotspot = hotspot;
        this.amount = amount;
        this.createdAt = createdAt;
        this.dateClient = dateClient;
    }

    
    
    @Id
    private ObjectId id;   
    
    //@Reference Client clientRef;
    private Key<Client> client;
    private Key<Hotspot> hotspot;
    private Double amount;

    @Property("createdAt")
    private Date createdAt;
    @Property("dateClient")
    private Date dateClient;

    //Lifecycle methods -- Pre/PostLoad, Pre/PostPersist...
    @PostLoad
    void postLoad(DBObject dbObj) {

    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDateClient() {
        return dateClient;
    }

    public void setDateClient(Date dateClient) {
        this.dateClient = dateClient;
    }
}
