package CodeCamp2;

import java.util.Scanner;

public class Program4 {
	


		public static void main(String[] args) 
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Input a string: ");
			String string=sc.next();
			int length=string.length();
			if(length%2!=0)
			{
			 char c= (char) string.codePointAt(length/2);
			 System.out.println("The middle character in the String: "+c);	
			}
			else
			{
				char c1=  (char) string.codePointAt((length/2)-1);
				char c2=  (char) string.codePointAt(length/2);
				System.out.println("The middle characters in the String : "+c1+" "+c2);
			}
		}

	

}
