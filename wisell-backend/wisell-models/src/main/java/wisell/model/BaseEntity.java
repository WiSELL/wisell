/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.model;

import java.util.Date;

import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.Property;

/**
 * 
 * @author papesdiop
 * @author yazid
 */

public abstract class BaseEntity {	
	@Id	
	protected String id;
	@Property(value = "creationDate")
	protected Date creationDate = null;
	protected Date updateDate = null;

	// Lifecycle methods -- Pre/PostLoad, Pre/PostPersist...
	@PrePersist
	void prePersist() {
		this.creationDate = (creationDate == null) ? new Date() : creationDate;
        this.updateDate = (updateDate == null) ? creationDate : new Date();
	}

	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}



	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
