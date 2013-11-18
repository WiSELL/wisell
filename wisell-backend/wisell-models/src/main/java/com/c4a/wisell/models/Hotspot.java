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
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.Property;

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


    @Indexed
    private String phone; // indexed phone field for better performance
    private String imei;
    private String name = null;
    private String email = null;
    private String address = null;
    private String tel = null;
    private List<Double> loc = new ArrayList<Double>(); // for geolocation

    
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

}
