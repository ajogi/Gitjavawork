import java.util.ArrayList;
import java.util.List;

public class User {
       
    private String name;
	private String contactNumber;
	private List<Hall> hallList= new ArrayList<Hall>();
	public User() {
		super();
	}

	public User(String name, String contactNumber) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	void addToHallList(Hall hall)
	{
		hallList.add(hall);
	}

	/*@Override
	public String toString() {
		return "User [name=" + name + ", contactNumber=" + contactNumber + "]";
	}*/
	
	public void displayDetails() {
		for (Hall hall : hallList) {
			System.out.println(hall);
		}
	}
	
	public void checkOwner(String s)
	{
		int i=0,temp=0;
		for (Hall hall : hallList) {
			i=i+1;
			if(hall.getOwnerName().equals(s))
			{
				//i=i+1;
				System.out.println("Hall "+i);
				System.out.println("Name:"+hall.getName());
				System.out.println("Cost per day:"+hall.getCostPerDay());	
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("No halls are available");
		}
	}

	

}
