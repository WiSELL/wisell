package wisell.model.event;

import java.util.Date;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

import wisell.model.BaseEntity;
import wisell.model.Hotspot;

/**
 * 
 * @author yazid
 * @author pape
 *
 */
@Entity(value="events", noClassnameStored=true)
public class Event extends BaseEntity{
	
	private Date occurenceDate;
	private EventStatus status;
	private EventType eventType;
	private String clientPhoneNumber;
	@Reference
	private Hotspot hotspot;
	Double duration;
	Double trafficVolume;
	public Event() {
		// TODO Auto-generated constructor stub
	}

	public Event(Date occurenceDate, EventStatus status, EventType eventType,
			String clientPhoneNumber, Hotspot hotspot) {
		super();
		this.occurenceDate = occurenceDate;
		this.status = status;
		this.eventType = eventType;
		this.clientPhoneNumber = clientPhoneNumber;
		this.hotspot = hotspot;
	}
	

	/**
	 * @return the occurenceDate
	 */
	public Date getOccurenceDate() {
		return occurenceDate;
	}

	/**
	 * @param occurenceDate the occurenceDate to set
	 */
	public void setOccurenceDate(Date occurenceDate) {
		this.occurenceDate = occurenceDate;
	}

	/**
	 * @return the status
	 */
	public EventStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(EventStatus status) {
		this.status = status;
	}

	/**
	 * @return the eventType
	 */
	public EventType getEventType() {
		return eventType;
	}

	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return the clientPhoneNumber
	 */
	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}

	/**
	 * @param clientPhoneNumber the clientPhoneNumber to set
	 */
	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}

	/**
	 * @return the hotspot
	 */
	public Hotspot getHotspot() {
		return hotspot;
	}

	/**
	 * @param hotspot the hotspot to set
	 */
	public void setHotspot(Hotspot hotspot) {
		this.hotspot = hotspot;
	}
	
	
	
	
}
