/*
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;

/**
 *
 * @author papesdiop
 */
@Entity("tarifications")
public class Tarification {

    @Id
    private ObjectId id;

    @Indexed
    private String mode; // mode tarification

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}
