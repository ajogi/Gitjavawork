package box;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Customer {

    private String name;
    private String address;
private int age;
private String mobileNumber;

public Customer(String name, String address, int age, String mobileNumber) {
super();
this.name = name;
this.address = address;
this.age = age;
this.mobileNumber = mobileNumber;
}

public Customer() {
super();
}

public String getName() {
return this.name;
}

public void setName(String name) {
this.name = name;
}

public String getAddress() {
return this.address;
}

public void setAddress(String address) {
this.address = address;
}

public int getAge() {
return this.age;
}

public void setAge(int age) {
this.age = age;
}

public String getMobileNumber() {
return this.mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
this.mobileNumber = mobileNumber;
}

public void displayCustomer()
{
System.out.println("Name "+this.name);
System.out.println("Mobile "+this.mobileNumber);
System.out.println("Age "+this.age);
System.out.println("Address "+this.address);
}
}

