package box;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.PrintStream;

	import box.PrivilegeCustomer;
	import box.SeniorCitizenCustomer;
	public class MainCustomer {
	    public static void main(String[] args) throws NumberFormatException, IOException
	{
	InputStreamReader input= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(input);

	System.out.println("1)Privilege Customer\n2)SeniorCitizen Customer\nEnter Customer Type");
	int n= Integer.parseInt(br.readLine());


	if(n==1)
	{
	System.out.println("Enter The Name");
	String s= br.readLine();

	System.out.println("Enter The Age");
	int x=Integer.parseInt(br.readLine());

	System.out.println("Enter The Address");
	String y= br.readLine();

	System.out.println("Enter The Mobile Number");
	String m= br.readLine();

	System.out.println("Enter The Purchased Amount");
	double am=Double.parseDouble(br.readLine());

	PrivilegeCustomer ob1= new PrivilegeCustomer(s,y,x,m,am);
	System.out.println("Bill Details");
	ob1.displayCustomer();
	System.out.println("Your bill amount is Rs "+am+". Your bill amount is discount under privilege customer");
	System.out.print("You have to pay Rs ");
	PrintStream printf = System.out.printf("%.2f",ob1.generateBillAmount(am));
	}
	else if(n==2)
	{
	System.out.println("Enter The Name");
	String s= br.readLine();

	System.out.println("Enter The Age");
	int x=Integer.parseInt(br.readLine());

	System.out.println("Enter The Address");
	String y= br.readLine();

	System.out.println("Enter The Mobile Number");
	String m= br.readLine();

	System.out.println("Enter The Purchased Amount");
	double am=Double.parseDouble(br.readLine());
	SeniorCitizenCustomer ob1= new SeniorCitizenCustomer(s,y,x,m,am);
	System.out.println("Bill Details");
	ob1.displayCustomer();
	System.out.println("Your bill amount is Rs "+am+". Your bill amount is discount under senior citizen customer");
	System.out.print("You have to pay Rs ");
	System.out.printf("%.2f",ob1.generateBillAmount(am));
	}
	else
	{
	System.out.println("Invalid Customer Type");
	}
	}
	}