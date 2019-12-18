package Additional;

import java.util.Scanner;
public class Mainstartwith {
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
 
        System.out.println("Enter the string");
        String str =sc.nextLine();
 
        // Testing the prefix using startsWith()
        System.out.println("Enter the start string");
        String str1=sc.nextLine();
        if(str.startsWith(str1))
       
           
        System.out.println("\""+str+"\"" +" starts with "+"\""+str1+"\"");
 
        else
        {
        System.out.print("\""+str+"\"" +" does not start with "+"\""+str1+"\"");
        
   
       
    }
}
}
