/*
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.models;

import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.PostLoad;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author papesdiop
 */
@Entity("hotspots")
public class Hotspot {

    public Hotspot() {
    }

    public Hotspot(String phone, String imei, Date createdAt) {
        this.phone = phone;
        this.imei = imei;
        this.createdAt = createdAt;
    }
    

    @Id
    private ObjectId id;

    @Indexed
    private String phone; // indexed phone field for better performance
    private String imei;
    private String name = null;

    String  // not stored if null
            email = null,
            address = null,
            tel = null;
    List<Double> loc = new ArrayList<Double>(); // for geolocation

    @Property("createdAt")
    Date createdAt;

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

}
