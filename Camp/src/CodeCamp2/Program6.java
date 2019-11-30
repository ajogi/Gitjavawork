package CodeCamp2;

import java.util.Scanner;

public class Program6 {
	    public static void main(String args[])
	    {
	        int m, year, month, day;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Input number of days:");
	        m = s.nextInt();
	        year = m / 365;
	        m = m % 365;
	        System.out.println("Number of years:"+year);
	        month = m / 30;
	        m = m % 30;
	        System.out.println("Number of month:"+month);
	        day = m;
	        System.out.println("Number of days:"+day);
	    }
	}
