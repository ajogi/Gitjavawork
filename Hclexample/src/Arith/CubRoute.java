package Arith;
import java.io.*;

    //Java program to find cubic root of a number 
	// using Binary Search 
public class CubRoute {
	    // Returns the absolute value of n-mid*mid*mid 
	    static double diff(double n,double mid) 
	    { 
	        if (n > (mid*mid*mid)) 
	            return (n-(mid*mid*mid)); 
	        else
	            return ((mid*mid*mid) - n); 
	    } 
	      
	    // Returns cube root of a no n 
	    static double cubicRoot(double n) 
	    { 
	        // Set start and end for binary search 
	    	double start = 0, end = 100; 
	   
	        // Set precision 
	        double e = 0.00; 
	   
	        while (true) 
	        { 
	            double mid = (start + end)/2; 
	            double error = diff(n, mid); 
	   
	            // If error is less than e then mid is 
	            // our answer so return mid 
	            if (error <= e) 
	                return mid; 
	   
	            // If mid*mid*mid is greater than n set 
	            // end = mid 
	            if ((mid*mid*mid) > n) 
	                end = mid; 
	   
	            // If mid*mid*mid is less than n set 
	            // start = mid 
	            else
	                start = mid; 
	        } 
	    } 
	      
	    // Driver program to test above function 
	    public static void main (String[] args)  
	    { 
	    
	        double n = 27; 
	        System.out.println("Cube root of "+n+" is "+cubicRoot(n)); 
	    } 
	    public static boolean isPrime(int num) {
	        if (num == 2 || num == 3) {
	            return true;
	        }

	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }

	        for (int i = 3; i < Math.sqrt(num); i += 2) {
	            if (num % i == 0 || num % Math.sqrt(num) == 0) {
	                return false;
	            }
	        }
	        return true;

	    }
	} 
	  