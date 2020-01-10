package Code;
 class Client
{
    private
  Integer clientId;
  String clientName;
  String phoneNumber;
  String email;
  String passport;
  Country country;
Client(){}
 public Client(Integer clientId, String clientName, String phoneNumber,String email, String passport, Country country) 
               {
                	this.clientId = clientId;
                	this.clientName = clientName;
                	this.phoneNumber = phoneNumber;
                 	this.email = email;
                 	this.passport = passport;
                	this.country = country;
               }
 public void setClientId(Integer clientId) {
    this.clientId = clientId;
}              
public Integer getClientId() {
	return clientId;
}
public void setClientName(String clientName) {
    this.clientName = clientName;
}
public String getClientName() {
	return clientName;
}
public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setEmail(String email) {
    this.email = email;
}
public String getEmail() {
	return email;
}
public void setPassport(String passport) {
    this.passport = passport;
}
public String getPassport() {
	return passport;
}

public void setCountry(Country country) {
    this.country = country;
}
public Country getCountry() {
	return country;
}

public String toString()
 {
     	//fill your code;
         return String.format("%-25s %-25s %-25s %-25s %-25s %s",clientId,clientName,phoneNumber,email,passport,country);
         
 }
}