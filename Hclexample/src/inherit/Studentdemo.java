package inherit;

public class Studentdemo {
	
	public static void main(String[] args) {
		Student s1=new Student(1234,new StringBuilder("Jogi"));
		/*s1.rollNumber=1234;
		s1.studentName.append("Jogi");*/
		s1.brethe();
		s1.talk();
		s1.walk();
	}

}
