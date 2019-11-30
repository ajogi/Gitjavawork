package codecamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentTester {

	public static void main(String[] args) 
	{
	
	Student s=new Student("Raj","Kumar",1);
	Student s1=new Student("Rama","Rao",2);
	List<Integer> al=new ArrayList<Integer>();
	al.add(s.grade);
	al.add(s1.grade);

}
class Grade1 implements Comparator<Stud>
{
    // Used for sorting in ascending order of
   
    public int compare(Student a, Student b)
    {
        return a.grade - b.grade;
    }

	@Override
	public int compare(Stud o1, Stud o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}}
