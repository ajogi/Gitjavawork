package Arith;

import java.util.Scanner;

public class Neggs {
	public static void main(String[] args) {
        int eggs;        
        int gross;                           
        int dozens;      
        int extras;      
                   
        Scanner sc=new Scanner(System.in);
        System.out.print("How many gross of eggs you have? = ");
        eggs =sc.nextInt();
        gross = eggs*144;
        System.out.print("How many dozens of eggs you have? =  ");
        dozens = sc.nextInt();
        dozens=dozens*12;
        System.out.print("How many extras eggs you have? = ");
        extras = sc.nextInt();
        eggs=gross+dozens+extras;
        System.out.println("Your number of eggs is : "+eggs);
        
        //System.out.println(gross);
        System.out.println("gross: "+gross);
        //System.out.println(dozens);
        System.out.println("dozen: "+dozens);
        //System.out.println(extras);
        System.out.println("Extras: "+extras);
     } 
 }

