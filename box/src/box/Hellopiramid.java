package box;
import java.util.Scanner;

public class Hellopiramid {
		
			public static void main(String[] args){
			    Scanner sc=new Scanner(System.in) ;
				int n=sc.nextInt();
				int k=0;
				for(int i=1;i<=n-1;i++)
				{
					for(int j=i;j<n;j++)
					{
						System.out.print("b");
					}
					while(k!=(2*i-1))
					{
						if(k==0||k==2*i-2)
							System.out.print("*");
						else
							System.out.print("i");
						k++;
					}
					k=0;
				for(int j=i;j<n;j++)
				{
					System.out.print("b");
				}
				System.out.println();
				}
				for(int i=0;i<2*n-1;i++)
				{
				System.out.print("*");
				}
			}

}
