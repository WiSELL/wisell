/*
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.models;

import com.mongodb.DBObject;
import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PostLoad;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author papesdiop
 */
public abstract class BaseEntity {
    // auto-generated, if not set (see ObjectId)
    @Id
    ObjectId id;
    @Property(value = "createdDate")
    Date createdDate = null;
    
    @PrePersist
    void prePersist(){
        this.createdDate = new Date();
    }
    
    //Lifecycle methods -- Pre/PostLoad, Pre/PostPersist...
    @PostLoad
    void postLoad(DBObject dbObj) {

    }

    
    public ObjectId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }
    
    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
