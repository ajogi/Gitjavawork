package CodeCamp2;
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		int flag=0;
		int[] arr1=new int[5];
		int[] arr2=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First array elements: "); 
		for(int i=0;i<5;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter Second array elements: "); 
		for(int i=0;i<5;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			if(arr1[i]==arr2[j])
			{
				System.out.println("Common element are:  "+arr1[i]);
				i++;
				flag=1;
			}
			}
		}
		if (flag==0)
			System.out.println("Distinct elements");
		}
	

}
