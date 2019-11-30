package Practice3;

abstract class Person {
	
	private String name;
	private int employee_code;
	private String gender;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(int employee_code) {
		this.employee_code = employee_code;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
public class Employee123 extends Person {
	
	
}

