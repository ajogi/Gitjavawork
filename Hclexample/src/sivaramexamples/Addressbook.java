package sivaramexamples;

public class Addressbook { private String name;
private Address tempAdd;
private Address permAdd;
private long phoneNumber;
private String emailid;
public String getName() {
 return name;
}
public void setName(String name) {
 this.name = name;
}
public Address getTempAdd() {
 return tempAdd;
}
public void setTempAdd(Address tempAdd) {
 this.tempAdd = tempAdd;
}
public Address getPermAdd() {
 return permAdd;
}
public void setPermAdd(Address permAdd) {
 this.permAdd = permAdd;
}
public long getPhoneNumber() {
 return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
 this.phoneNumber = phoneNumber;
}

//nested class
class Address
{ private String housename;
  private String street;
  private String address;
  private String city;
  private String state;
public String getHousename() {
 return housename;
}
public void setHousename(String housename) {
 this.housename = housename;
}
public String getStreet() {
 return street;
}
public void setStreet(String street) {
 this.street = street;
}
public String getAddress() {
 return address;
}
public void setAddress(String address) {
 this.address = address;
}
public String getCity() {
 return city;
}
public void setCity(String city) {
 this.city = city;
}
public String getState() {
 return state;
}
public void setState(String state) {
 this.state = state;
}
@Override
public String toString() {
 return "Address [housename=" + housename + ", street=" + street + ", address=" + address + ", city=" + city
   + ", state=" + state + "]";
}
 
}

}
