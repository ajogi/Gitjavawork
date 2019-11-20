package box;
import java.util.Scanner;

public class Event {
	public static void main(String[] args) 	{
	        
	        System.out.println("Enter the name of the event");
	        Scanner sc=new Scanner(System.in);
	        String s1=sc.nextLine();
	        System.out.println("Enter the type of the event");
	        String s2=sc.nextLine();
	        System.out.println("Enter the number of people expected");
	        String s3=sc.nextLine();
	        System.out.println("Is it a paid entry? (Type Y or N)");
	        char s4=sc.nextLine().charAt(0);
	        System.out.println("Enter the projected expenses (in lakhs) for this event");
	        String s5=sc.nextLine();
	        Double D=Double.parseDouble(s5);
	        System.out.println("Event Name : "+s1);
	        System.out.println("Event Type : "+s2);
	        System.out.println("Expected Count : "+s3);
	        System.out.println("Paid Entry : "+s4);
	        System.out.print("Projected Expense : ");
	        System.out.printf("%.1f",D);
	        System.out.print("L");
	       
	    }
	}




