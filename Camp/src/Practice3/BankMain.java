package Practice3;

import java.util.Scanner;
abstract class Bank1 {
	String account_no;
	String customer_name;
	String trans_type ;
	double balanceamount;
	String bankName;
	double trans_amount;
	double newbalanceamount;
	double newbalanceamount1;
	double newbalanceamount2;
	public Bank1(String account_no, String customer_name,String bankName, String trans_type, double balanceamount, double trans_amount,double newbalanceamount) {
		super();
		this.account_no = account_no;
		this.customer_name = customer_name;
		this.bankName=bankName;
		this.trans_type = trans_type;
		this.balanceamount = balanceamount;
		this.trans_amount = trans_amount;
		this.newbalanceamount=newbalanceamount;
	}

	abstract double calculate_Interest();
	public void display()
	  {
		  
		  System.out.println("Account no: " +account_no);
		  System.out.println("Customer name: " +customer_name);
		  System.out.println("Bank name:" +bankName);
		  System.out.println("Transaction type :" +trans_type);
		  System.out.printf("Transaction amount:Rs %.2f" ,trans_amount);
		  System.out.println(" ");
		  System.out.printf("Balance amount: Rs %.2f", +balanceamount);
		  System.out.println(" ");
		  System.out.printf("newbalanceamount: Rs %.2f", +newbalanceamount);
		  System.out.println(" ");
		 
		
		  }
	

}
class SbiBank extends Bank1 {
	
	public SbiBank(String account_no,String customer_name,String bankName,String trans_type,double balanceamount,double trans_amount,double newbalanceamount)
	
	{
		super(account_no,customer_name,trans_type, bankName,balanceamount,trans_amount,newbalanceamount);
		
	}
  double calculate_Interest()
  { double interestamount=0;
  balanceamount=this.balanceamount;
	  interestamount = (balanceamount * 6.5)/100;
	return balanceamount+interestamount;
	  
  }
  public void display()
  {
	  super.display();
	
	  System.out.println("Interest amount: Rs." +calculate_Interest());
	  if (trans_type.equals("Deposit")) {  
		  newbalanceamount = balanceamount + trans_amount;
		  System.out.println("New Balance: " +newbalanceamount);
			
		}
  }
  
}
class HdfcBank extends Bank1 {
public HdfcBank(String account_no,String customer_name,String bankName,String trans_type,double balanceamount,double trans_amount,double newbalanceamount1)
	
	{
		super(account_no,customer_name,trans_type, bankName,balanceamount,trans_amount,newbalanceamount1);
		
	}
	double calculate_Interest()
	  {
		double interestamount=0;
		 balanceamount=this.balanceamount;
		interestamount = (balanceamount *  7.2)/100;
		return interestamount;
		  
	  }
	public void display()
	  {
		  super.display();
		  System.out.println("Bank name:" +"HDFC");
		  System.out.println("Interest amount: Rs." +calculate_Interest());
		  if (trans_type.equals("Deposit")) {  
			  newbalanceamount1 = balanceamount + trans_amount;
			  System.out.println("New Balance: " +newbalanceamount1);
				
			}
	  }

}
class BobBank extends Bank1 {
public BobBank(String account_no,String customer_name,String bankName,String trans_type,double balanceamount,double trans_amount,double newbalanceamount2)
	
	{
		super(account_no,customer_name,trans_type, bankName,balanceamount,trans_amount,newbalanceamount2);
		
	}
	double calculate_Interest()
	  {
		double interestamount=0;
		 balanceamount=this.balanceamount;
		interestamount= (balanceamount *  5.2)/100;
		return interestamount;
		  
	  }
	public void display()
	  {
		  super.display();
	//bankName=sc.nextLine();
		  System.out.printf("Interest amount: Rs%.2f" ,calculate_Interest());
		  System.out.println();
		  if (trans_type.equals("Deposit")) {  
			  newbalanceamount2 = balanceamount + trans_amount;
			  System.out.println("New Balance: " +newbalanceamount2);
				
			}
	  }

}


public class BankMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer details");
		String account_no = sc.next();
		String customer_name= sc.next();
		String bankName=sc.next();
		String trans_type = sc.next();
		double trans_amount = sc.nextDouble();
		double balanceamount = sc.nextDouble();
		double newbalanceamount=0;
		Bank1 b ;
		b=new SbiBank(account_no,customer_name,bankName,trans_type,balanceamount,trans_amount,newbalanceamount);
		b.display();
		
		System.out.println("Enter customer details");
		String account_no1 = sc.next();
		String customer_name1= sc.next();
		String bankName1=sc.next();
		String trans_type1 = sc.next();
		double trans_amount1 = sc.nextDouble();
		double balanceamount1 = sc.nextDouble();
		double newbalanceamount1=0;
		b = new HdfcBank(account_no1,customer_name1,bankName1,trans_type1,balanceamount1,trans_amount1,newbalanceamount1);
	     b.display();
	 
	 System.out.println("Enter customer details");
	 String account_no2 = sc.next();
		String customer_name2= sc.next();
		String bankName2=sc.next();
		String trans_type2 = sc.next();
		double trans_amount2 = sc.nextDouble();
		double balanceamount2 = sc.nextDouble();
		double newbalanceamount2=0;
		 b = new BobBank(account_no2,customer_name2,bankName2,trans_type2,balanceamount2,trans_amount2,newbalanceamount2);
		b.display();

		
		}

}
