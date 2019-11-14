package Arith;

import java.util.Scanner;

public class Income {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your tax :");

    long tax=sc.nextLong();

    if(tax>0 && tax<=180000){
    System.out.println("No TAx");
    }
    else if(tax>=180001 && tax<=500000){
    System.out.println("the tax is 10%");
    }
    else if(tax>=500001 && tax<=800000){
    System.out.println("thetax is 20%");
    }
    else if(tax>=800001){
    System.out.println("thetax is 30%");
    }
    else{
    System.out.println("Not Acceptable");
    }
  }
}

