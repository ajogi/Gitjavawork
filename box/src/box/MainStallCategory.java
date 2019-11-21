package box;

import java.util.Scanner;
	
	public class MainStallCategory {

	public static void main(String[] args) {

		StallCategory s1=new StallCategory();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the name of the stall category:");
	    s1.setName(sc.nextLine());
	    System.out.println("Enter the details of the stall category:");
	   
	    s1.setDetails(sc.nextLine());
	    System.out.println("Using Default Constructor");
	    System.out.println("Details of the stall category:");
	    s1.display();
	    System.out.println("Using Parameterised Constructor");
	    System.out.println("Details of the stall category:");

	    s1.display();
	    } 
	} 
