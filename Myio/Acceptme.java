package Myio;

import java.util.Scanner;

public class Acceptme {

    public static void main(String[] args) {
        int empid;
        String empname;
        Float empsalary;
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empid:");
		empid =sc.nextInt();
		
		System.out.print("Enter the empname:");
		sc.next();
		empname=sc.nextLine();
	
		System.out.println("enter the empsalary:");
		empsalary= sc.nextFloat();

	}  
    }


