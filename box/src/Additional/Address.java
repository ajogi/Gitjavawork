package Additional;

import java.io.InputStream;

class Address {
	
	private String street;
	private String city;
	private int pincode;
	private String country;
	
Address(String street,String city,Integer pincode,String country) {
    this.street=street;
    this.city=city;
    this.pincode=pincode;
    this.country=country;
	}

public Address(InputStream in) {
}		
}
