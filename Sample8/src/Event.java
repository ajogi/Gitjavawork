import java.util.Date;

public class Event {//Start of event class
    
	private String name;//declaring variables
	private Date eventDate;
	private String organizer;
	
	public Event() {//default constructor
		super();
	}

	public Event(String name, Date eventDate, String organizer) {//parameterized constructor
		super();
		this.name = name;
		this.eventDate = eventDate;
		this.organizer = organizer;
	}

	public String getName() {//getters and setters for variables
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

}