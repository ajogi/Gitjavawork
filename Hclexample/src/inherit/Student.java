package inherit;

public class Student extends Human {
 public int rollNumber;
 public StringBuilder studentName;
 
 //constructor
 Student(){
	 System.out.println("Student object constructor");
 }
 
 //constructor overloading
public Student(int rollNumber, StringBuilder studentName) {
	super();
	this.rollNumber = rollNumber;
	this.studentName = studentName;
}


}
 

