package LabAs1;
import java.util.Scanner;

public class BillElectricity {

	
		  private static Scanner sc;
		  public static void main(String[] args)
		  {
		   String name;
		   int Units; 
		   double Final_Amt;
		   sc = new Scanner(System.in);
		   //System.out.print("Customer name: ");
		  // name=sc.next();
		   System.out.print("Please Enter the Units that you Consumed  : ");
		   Units = sc.nextInt();
		  
		   Final_Amt = Electricity(Units);
		   System.out.println("Final amount:  =  " + Final_Amt);
		  }
		  public static double Electricity(int Units)
		  {
		   double Amount = 0, Suv_Tax=0.1475,Fixed_meter=250,Final_Amt, BillAmount;
		   if (Units <=100)
		     {
		      Amount = Units * 3.25; 
		     }
		   else if (Units>100 && Units <= 300)
		     {
		      Amount =Units*4.75; 
		     }
		     
		     else
		     {
		       Amount = Units * 6.35;
		    }
		   
		   BillAmount = Amount +Fixed_meter;
		   Final_Amt=BillAmount+(BillAmount*Suv_Tax);
		   return Final_Amt;
		  }
}
