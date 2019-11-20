package box;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Expenses {
	public static void main(String[] args) {
		double branding,travel,food,logistics,Total;
		
		Scanner sc=new Scanner(System.in);
		 //DecimalFormat df=new DecimalFormat("##.00");
		System.out.println("Enter branding expenses");
		branding=sc.nextDouble();
		System.out.println("Enter travel expenses");
		travel=sc.nextDouble();
		System.out.println("Enter food expenses");
		food=sc.nextDouble();
		System.out.println("Enter logistics expenses");
		logistics=sc.nextDouble();
	 
	    Total=(branding+travel+food+logistics);
	   
	   
	    branding=((branding*100)/Total);
	    travel=((travel*100)/Total);
	    food=((food*100)/Total);
	    logistics=((logistics*100)/Total);
	    DecimalFormat df=new DecimalFormat("#####.00");
	    
	    
	    System.out.println("Total expenses:Rs."+df.format(Total));
	    System.out.println("Branding expenses percentage:"+df.format(branding)+"%");
	    System.out.println("Travel expenses percentage:"+df.format(travel)+"%");
	    System.out.println("Food expenses percentage:"+df.format(food)+"%");
	    System.out.println("Logistics expenses percentage:"+df.format(logistics)+"%");
	}
	


}
