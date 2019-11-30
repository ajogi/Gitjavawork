package CodeCamp2;

import java.util.Scanner;

public class Program5 {
	    public static void main(String args[]){
	        String x, y = "";
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string: ");
	        x = sc.nextLine();
	        int n = x.length();
	        for(int i = n - 1; i >= 0; i--) {
	            y = y+ x.charAt(i);
	        }
	        if(x.equalsIgnoreCase(y)) {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	    }	
}
