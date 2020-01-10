import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
	public static void main(String args[])
	{
		List<User> li= new ArrayList<User>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of users:");
		int n1= Integer.parseInt(sc.nextLine());
		for(int i=0;i<n1;i++)
		{
			System.out.println("User"+(i+1)+"\r\nName:");
			String name= sc.nextLine();
			System.out.println("contact number:");
			String connum= sc.nextLine();
			User u= new User(name, connum);
			li.add(u);
		}
		/*for (User user : li) {
			System.out.println(user.getName());
		}*/
		
		System.out.println("Enter the number of halls:");
		int n2= Integer.parseInt(sc.nextLine());
		User user= new User();
		for(int i=0;i<n2;i++)
		{
			System.out.println("Hall"+(i+1)+"\r\nName:");
			String hname= sc.nextLine();
			System.out.println("Cost per day:");
			int hcost= Integer.parseInt(sc.nextLine());
			System.out.println("Owner Name:");
			String howner= sc.nextLine();
			Hall h= new Hall(hname, hcost, howner);
			user.addToHallList(h);
		}
		
		//user.displayDetails();
		
		for (User u : li) {
			System.out.println("Owner Name:"+u.getName());
			user.checkOwner(u.getName());
			
		}
	}

}