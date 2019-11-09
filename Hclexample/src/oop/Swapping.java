package oop;

import java.util.Scanner;

public class Swapping {
public static void main(String arg[]) {  
int x ;  
int y ;
 Scanner s = new Scanner(System.in);
 System.out.println("value of x:");
 x=s.nextInt();
 System.out.println("value of y:");
 y=s.nextInt();
 System.out.println("After swapping");  
 x = x + y;  
 y = x - y;  
 x = x - y;  
 System.out.println("value of x:" + x);  
 System.out.println("value of y:" + y);  
}  
} 
