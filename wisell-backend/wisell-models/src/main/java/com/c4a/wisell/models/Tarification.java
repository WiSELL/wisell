/*
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.models;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;

/**
 *
 * @author papesdiop
 */
@Entity("tarifications")
public class Tarification extends BaseEntity {

    @Indexed
    private String mode; // mode tarification

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}
