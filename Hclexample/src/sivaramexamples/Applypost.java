package sivaramexamples;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class Applypost {
	 
	  public static void main(String[] args)throws IOException{
	  Post p=new Post();
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  //prompt the user to enter his name
	  System.out.println("Enter your Name:");
	  p.setCandidateGender(br.readLine());
	  //prompt the user to enter his Gender
	  System.out.println("Enter your Gender(male/female):");
	  p.setCandidateGender(br.readLine());
	  if(p.getCandidateGender().equalsIgnoreCase("female"))
	  {
	   System.out.println("Sorry..you are not eligible for this past!");
	   System.exit(1);
	  }else
	  {
	  //prompt the user to enter age
	  System.out.println("Enter age in years:");
	  p.setAge(Byte.parseByte(br.readLine()));
	  if(p.getAge()<20 || p.getAge()>50)
	  {
	   System.out.println("Sorry..you are not eligible for this past!");
	   System.exit(1);
	  }
	  System.out.println("Enter units of weight:");
	  System.out.println("1.in kgs\t2.in lbs\nEnter units of your choice");
	  int choice=Integer.parseInt(br.readLine());
	  System.out.println("Enter weight :");
	  p.setWeight(Integer.parseInt(br.readLine()));
	  if(choice==2)
	  {
	   p.setWeight(p.getWeight()*2.2046f);
	  }
	  System.out.println("Enter units of weight:");
	  System.out.println("1.in cm\t2.in inches\nEnter units of your choice");
	   choice=Integer.parseInt(br.readLine());
	  System.out.println("Enter height :");
	  p.setWeight(Integer.parseInt(br.readLine()));
	  if(choice==2)
	  {
	   p.setHeight(p.getHeight()*2.54f);
	  }
	  }
	  
	 }
}


