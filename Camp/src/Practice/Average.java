package Practice;

import java.util.Scanner;

public class Average {
	public static void main(String[] args)

	{ 
        int n,num,sum=0, i;
        //create scanner object to obtain input from keyboard
        Scanner input =new Scanner(System.in);
       // System.out.print("Enter How Many Numbers : ");//input
        //n =input.nextInt(); //read total numbers
        //System.out.print("Enter the Numbers :");
        for(i=1;i<=5; i++)
            {
                 num=input.nextInt(); //input number
                 sum += num;
            }
         int average=(int)sum/5;
         System.out.println(average);
	 
	}

}
