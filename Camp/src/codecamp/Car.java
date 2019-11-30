package codecamp;
import java.io.IOException;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) throws IOException
	{
		int n=0,m=0;
		Scanner sc=new Scanner(System.in);
		int[] evenNumber=new int[10];
		int[] oddNumber=new int[10];
		int[] carNumber=new int[10];
		System.out.println("Enter car numbers");
		for(int i=0;i<10;i++)
		{
		carNumber[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			int temp=carNumber[i];
			if(temp%2==0)
			{
				evenNumber[n]=carNumber[i];
				System.out.println("Even Car Number "+evenNumber[n]);
				n++;
			}
			else
			{
				oddNumber[m]=carNumber[i];
				System.out.println("Odd Car Number "+oddNumber[m]);
				m++;
			}
		}
		
	}

}
