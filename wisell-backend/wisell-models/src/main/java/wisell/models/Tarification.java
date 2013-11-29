/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.models;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;
import wisell.models.enums.TarificationMode;

/**
 *
 * @author papesdiop
 */
@Entity("tarifications")
public class Tarification extends BaseEntity {

    @Indexed
    private TarificationMode mode; // mode tarification 
    
    private Double size = null;
    private Double sizeCost = null;
    private Double time = null; // means number of minutes in time mode tarification
    private Double timeCost = null;
    
    public Tarification(TarificationMode mode, Double size, Double sizeCost) {
        this.mode = mode;
        this.size = size;
        this.sizeCost = sizeCost;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSizeCost() {
        return sizeCost;
    }

    public void setSizeCost(Double sizeCost) {
        this.sizeCost = sizeCost;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Double getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(Double timeCost) {
        this.timeCost = timeCost;
    }

    public TarificationMode getMode() {
        return mode;
    }

    public void setMode(TarificationMode mode) {
        this.mode = mode;
    }

}
