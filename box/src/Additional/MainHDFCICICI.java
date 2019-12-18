package Additional;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;
	public class MainHDFCICICI {
		public static void main(String[] args) throws IOException{		
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader bread= new BufferedReader(isr);		
			System.out.println("Select the Bank Name\n1.ICICI\n2.HDFC");
			int n= Integer.parseInt(bread.readLine());				
			if(n==1)
			{
	            System.out.println("Enter the Message to Transfer");
			    String x= bread.readLine();
				BankTransfers obj= new ICICI();
				System.out.println("The Encrypted message is : "+obj.encrypt(x));
				System.out.println("The Decrypted message is : "+obj.decrypt(obj.encrypt(x)));
			}
			else if(n==2)
			{
	            System.out.println("Enter the Message to Transfer");
			    String x= bread.readLine();
				BankTransfers obj= new HDFC();
				System.out.println("The Encrypted message is : "+obj.encrypt(x));
				System.out.println("The Decrypted message is : "+obj.decrypt(obj.encrypt(x)));	
			}
			else
			{
				System.out.println("Invalid Type");
			}
		}
	}