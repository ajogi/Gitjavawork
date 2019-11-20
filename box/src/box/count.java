package box;
import java.util.Scanner;
public class count {
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in) ;
			int n=sc.nextInt();int c=0,d=0;
			int a[]=new int[n];
			Scanner sc1=new Scanner(System.in) ;
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]%2==0)
				{
					c++;
				}
				else
					d++;
			}
			System.out.println(c+" "+d);
		}
	}


