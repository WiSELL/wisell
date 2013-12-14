/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PostLoad;
import org.mongodb.morphia.annotations.PostPersist;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.PreSave;
import org.mongodb.morphia.annotations.Property;

import com.mongodb.DBObject;

/**
 * 
 * @author papesdiop
 * @author yazid
 */

public abstract class BaseEntity {	
	@Id	
	protected ObjectId id;
	@Property(value = "creationDate")
	protected Date creationDate = null;
	protected Date updateDate = null;

	// Lifecycle methods -- Pre/PostLoad, Pre/PostPersist...
	@PrePersist
	void prePersist() {
		this.creationDate = (creationDate == null) ? new Date() : creationDate;
        this.updateDate = (updateDate == null) ? creationDate : new Date();
	}

	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreatedDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.creationDate = createdDate;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
