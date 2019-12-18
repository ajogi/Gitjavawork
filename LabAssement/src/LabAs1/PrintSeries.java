package LabAs1;

import java.util.Scanner;

public class PrintSeries {	

	public static void main(String args[]) {
	int i,x=0,b=3;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the Input : ");
	int n=sc.nextInt();
	for(i=0;i<n;i++)
	{
	 System.out.print(" "+x);
	 x=x+b;
	 b=b+2;
	}
	}

}

