package Practice;

import java.util.Scanner;

public class ArmStrong {
	 private static boolean isArmStrong(int num)
	  {
	    int res = 0; int ori = num;
	    while(num != 0)
	    {
	    int rem = num %10;
	    res = res + rem*rem*rem;
	    num = num/10;
	    }
	    if(ori == res)
	    {
	     return true;
	     }
	    else
	     return false;
	     }
	          
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Input number is:");
	 int num=sc.nextInt();
	 if(isArmStrong(num))
	 {
	  System.out.println("Given number is ArmStrong");
	 }
	 else
	 {
	 System.out.println("not armstrong number");
	 }
	} 
	

}
