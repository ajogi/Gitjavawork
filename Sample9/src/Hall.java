import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Hall {
    
	private String hallName;//Declaring variables
	private String contact;
	private double costPerDay;
	private String owner;
	
	public Hall() {//Default constructor
		super();
	}

	public Hall(String hallName, String contact, double costPerDay, String owner) {//Parameterized constructor
		super();
		this.hallName = hallName;
		this.contact = contact;
		this.costPerDay = costPerDay;
		this.owner = owner;
	}

	public String getHallName() {//Getters ad setters for variables
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
    public static void writeHallDetails(List<Hall> halls)
	{
		FileWriter fi=null;
		try {
			fi= new FileWriter("hall.csv",false);//Create a file
			for (Hall hall : halls) {
				String s= hall. hallName+","+hall.contact+","+hall.costPerDay+","+hall.owner+"\n";//Get hall details into a string
				fi.write(s);//Write it in the file
				//System.out.println("Ok...");
			}
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fi.close();//Close the file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}