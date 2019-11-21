package Additional;

import java.io.InputStream;

class Customer {
	String customerName;
	String customerEmail;
	String customerType;
	Address customerAddress;
	
Customer(String customerName,String customerEmail,String customerType,Address address){
   this.customerName=customerName;
   this.customerEmail=customerEmail;
   this.customerType=customerType;
   this.customerAddress=customerAddress;
 }

public Customer(InputStream in) {
	
}	
}
