package Additional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		Customer c=new Customer(System.in);
		Address ad=new Address(System.in);
	
		System.out.println("Enter the Customer Details");
		System.out.println("Enter the name");
		String name=br.readLine();
		System.out.println("Enter the email");
		String email=br.readLine();
		System.out.println("Enter the type");
		String type=br.readLine();
		System.out.println("Enter Customer Address");
		System.out.println("Enter the street");
		String street=br.readLine();
		System.out.println("Enter the city");
		String city=br.readLine();
		System.out.println("Enter the pincode");
		long pincode=Long.parseLong(br.readLine());
		System.out.println("Enter the country");
		String country=br.readLine();

		
		
		br.close();
		dispalyAddress();
		
		
		
	}

	private static void dispalyAddress() {
		
		
	}

}
