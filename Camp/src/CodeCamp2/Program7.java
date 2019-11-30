package CodeCamp2;

import java.util.Scanner;

public class Program7 {
	private static Scanner sc;
	 public static void main(String[] args)
	  {
		 int basic_salary;
		 double gross;
		 sc = new Scanner(System.in);
		 System.out.print("Please Enter the salary  : ");
		 basic_salary = sc.nextInt();
		 
		 gross = wages(basic_salary);
		System.out.println("gross amount:  =  " + gross);
		  }
public static double wages(int basic_salary)
	{
		 
		 double gross,HRA = 0,DA = 0;
		 if (basic_salary <1500)
		 {
			 HRA = basic_salary * 0.10;
			 DA = basic_salary*0.90;   
		  }
		 else if (basic_salary >= 1500)
	     {
			 HRA = 500;
			 DA = basic_salary*0.98;   
	     }
		 gross=basic_salary+HRA+DA;
		return gross;
	  }
}
