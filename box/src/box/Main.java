package box;

import java.io.*;
import java.text.*;

public class Main{
	
public static void main(String args[]) throws IOException{
		
	
	
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ProductBO b=new ProductBO();

String loop;
product p[]=new product[100];

int i=0;

do {
	System.out.println("Enter the product id");
	long id=Long.parseLong(br.readLine());
	System.out.println("Enter the product name");
	String pname=br.readLine();
	System.out.println("Enter the supplier name");
	String sname=br.readLine();
	System.out.println("Enter the product price");
	int price=Integer.parseInt(br.readLine());
	System.out.println("Do you want to enter the details of another product? Enter yes or no (not case sensitive)");
	 
	
	loop=br.readLine();
	p[i]=new product(id,pname,sname,price);
	i++;

}
while(loop.equals("yes")||loop.equals("YES"));
b.displayAllProductDetails(p,i);

 	}
	
}
	
