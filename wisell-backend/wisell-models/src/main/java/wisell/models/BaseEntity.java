/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.models;

import com.mongodb.DBObject;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PostLoad;
import org.mongodb.morphia.annotations.PostPersist;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author papesdiop
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class BaseEntity {
    // auto-generated, if not set (see ObjectId)
    @Id
    ObjectId id;
    @Property(value = "createdDate")
    Date createdDate = null;
    
    
    
    //Lifecycle methods -- Pre/PostLoad, Pre/PostPersist...
    @PrePersist
    void prePersist(DBObject dbObj){
        this.createdDate = new Date();
        
    }
    
    @PostLoad
    @PostPersist
    void postLoad(DBObject dbObj) {
        System.out.println("postPersist object " + dbObj);
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
