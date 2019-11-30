package CodeCamp2;
import java.util.Scanner;
public class ArraySize{
	public static int getSmallestNumber(int a[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please the size of the Array:");
		int c=sc.nextInt();
		int t=0;
		{
			for (int x=0; x<c; x++)
			{

				for(int y=x+1;y<c; y++)
				{
					if(a[x]>a[y])
					{
						t=a[x];
						a[x]=a[y];
						a[y]=t;
					}
				}
			}
		}
		return a[0];
	}
	public static void main(String args[]){
		int a[]= {4,6,8,10,12,14,16,18,20,2};
		System.out.println("Smallest value of the given array is:"+getSmallestNumber(a));
}
}