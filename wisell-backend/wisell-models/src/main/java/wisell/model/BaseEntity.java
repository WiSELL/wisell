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
	// auto-generated, if not set (see ObjectId)
	@Id	
	protected ObjectId id;
	@Property(value = "createdDate")
	protected Date createdDate = null;
	protected Date updateDate = null;

	// Lifecycle methods -- Pre/PostLoad, Pre/PostPersist...
	@PrePersist
	void prePersist(DBObject dbObj) {
		this.createdDate = new Date();
	}

	@PreSave
	void preUpdate(DBObject dbObj) {
		this.updateDate = new Date();
	}

	@PostLoad
	@PostPersist
	void postLoad(DBObject dbObj) {
		System.out.println("postLoad object " + dbObj);
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
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
