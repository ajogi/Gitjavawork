package Practice3;

//Immutable class

final class Student1
{
  final String name;
  final int regNo;

  public Student1(String name, int regNo)
  {
      this.name = name;
      this.regNo = regNo;
  }
  public String getName()
  {
      return name;
  }
  public int getRegNo()
  {
      return regNo;
  }
} 

//Test Immutable class 

public class Test
{
public static void main(String args[])
 {
     Student1 s = new Student1("Jogi", 599);
     System.out.println(s.getName());
     System.out.println(s.getRegNo());

     
 }
}