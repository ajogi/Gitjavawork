package CodeCamp2;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
	String name;
	int d,d1,d2;
	int j,j1,j2;
	int netw,netw1,netw2;
	int dsum,davg;
	int javg,jsum;
	int netwsum,netwavg;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the scholar1 Name: ");
	name=sc.next();
	System.out.print("Enter the marks of Digital_Logic: ");
	d=sc.nextInt();
	System.out.print("Enter the marks of Networking: ");
	j=sc.nextInt();
	System.out.print("Enter the marks of JAVA: ");
	netw=sc.nextInt();
	System.out.print("Enter the Scholar2 Name:");
	name=sc.next();
	System.out.print("Enter the marks of Digital_Logic: ");
	d1=sc.nextInt();
	System.out.print("Enter the marks of Networking: ");
	j1=sc.nextInt();
	System.out.print("Enter the marks of JAVA: ");
	netw1=sc.nextInt();
	System.out.print("Enter the Scholar3 Name:");
	name=sc.next();
	System.out.print("Enter the marks of Digital_Logic: ");
	d2=sc.nextInt();
	System.out.print("Enter the marks of Networking: ");
	j2=sc.nextInt();
	System.out.print("Enter the marks of JAVA: ");
	netw2=sc.nextInt();
	dsum=d+d1+d2;
	davg=dsum/3;
	System.out.println("Average of Digital_Logic of three scholars is: "+davg);
	jsum=j+j1+j2;
	javg=jsum/3;
	System.out.println("Average of Networking of three scholars is: "+javg);
	netwsum=netw+netw1+netw2;
	netwavg=netwsum/3;
	System.out.println("Average marks in JAVA of three scholars is: "+netwavg);
	}

	}