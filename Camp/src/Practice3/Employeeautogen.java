package Practice3;
import java.util.ArrayList;
import java.util.List;

class Employee {
	private String Name;
	private String employee_code;
	private char gender;
	private String location;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

public String autoIncrement(String employee_code){
	String seq=employee_code.substring(1,5);
	char firstChar=employee_code.charAt(0);
	int seqval=Integer.parseInt(seq);
	seqval++;
	System.out.println("first char="+seq+"seqval=+seqval");
if(seqval<=10){
	employee_code=(""+firstChar+"00"+seqval);
	}
	else if(seqval<=100){
		employee_code=(""+firstChar+"0"+seqval);
	}
	else if (seqval<=1000){
		employee_code=(""+firstChar+seqval);
	}
   return employee_code;
 }
}
public class Employeeautogen{
	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<Employee>();
		char reply='y';
		Employee e=new Employee();
		e.setEmployee_code("W0009");
		e.setEmployee_code(e.autoIncrement(e.getEmployee_code()));
		System.out.println(e.getEmployee_code());

}

}