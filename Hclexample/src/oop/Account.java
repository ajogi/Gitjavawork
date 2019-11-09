package oop;

import java.util.Scanner;

public class Account {
	public static void main (String args[])
	{
	Long AccountNumber;
	String Accounttype;
	float balance;
	String username;
	String IFSCcode;

	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter your Accout Number: ");
	AccountNumber=sc.nextLong();

	System.out.print("Enter Accout type : ");
	//sc.next();
	Accounttype =sc.next();

	System.out.print("Enter the balance: ");
	balance=sc.nextFloat();
	
	System.out.print("Enter username: ");
	//sc.next();
	username =sc.next();
	
	System.out.print("Enter the IFSCcode: ");
	IFSCcode=sc.next();
	
	System.out.print(" Account number is: "+AccountNumber+"\n Account type is: "+Accounttype+"\n Balance is: "+balance+"\n User Name is: "+username+"\n IFSC code is : "+IFSCcode);



	}

}
