package LabAs1;

import java.util.Scanner;

public class CommandLineArgs {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String full_name,address,email;	
		System.out.print("Full Name : ");
		full_name=sc.nextLine();
		System.out.print("Address : ");
		address=sc.nextLine();
		System.out.print("Email : ");
		email=sc.nextLine();
		if(full_name.isEmpty()) {
			System.out.println("Insufficient data");
			
		}
		else if(address.isEmpty()) {
			System.out.println("Insufficient data");
			
		}
		else if(email.isEmpty()) {
			System.out.println("Insufficient data");
			
		}
		else {
			System.out.println("Full Name : "+full_name + " ,Address : "+address+" ,Email : "+email);
		}

	}
	

}
