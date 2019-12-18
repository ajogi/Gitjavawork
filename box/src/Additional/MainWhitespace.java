package Additional;

import java.util.Scanner;
import java.util.StringTokenizer;
public class MainWhitespace {
public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String st =sc.nextLine();
    StringTokenizer st1=new StringTokenizer(st, " ");


System.out.println("The words in the string are"); 
//splits the string based on whitespace 
//using java for each loop to print elements of string array 
while(st1.hasMoreElements()){
  
System.out.println(st1.nextElement()); 
}
}
} 