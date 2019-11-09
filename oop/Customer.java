package oop;

import java.time.LocalDate;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		String Name,Address,DestinationName,reason,status;
		int age;
		Long mobilenumber,phoneNo;
		LocalDate dob,departureDate;
		Scanner sc = new Scanner(System.in);
	   System.out.print("Enter your Name: ");
	   Name=sc.next();
	   System.out.print("Enter your Address: ");
	   Address=sc.next();
	   System.out.print("Enter your DestinationName: ");
	   DestinationName=sc.next();
	   System.out.print("Enter your Reason: ");
	   reason=sc.next();
	   System.out.print("Enter your status: ");
	   status=sc.next();
	   

	   System.out.print("Enter your age: ");
	   age=sc.nextInt();
	   System.out.print("Enter your mobilenumber: ");
	   mobilenumber=sc.nextLong();
	   System.out.print("Enter your phoneNo: ");
	   phoneNo=sc.nextLong();
	   
	   
	   

	}

}
