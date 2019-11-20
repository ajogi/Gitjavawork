package box;

import java.util.Scanner;

public class Lukywinner {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x%10==3||x%10==8)
		{
			System.out.println("Lucky Winner");
		}
		else
			System.out.println("Not a Lucky Winner");
	}

}
