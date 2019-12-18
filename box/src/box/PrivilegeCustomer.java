package box;
class PrivilegeCustomer extends Customer{



    double amount;

public PrivilegeCustomer(String name, String address, int age, String mobileNumber, double amount) {
super(name, address, age, mobileNumber);
this.amount = amount;
}

public double getAmount() {
return amount;
}

public void setAmount(double amount) {
this.amount = amount;
}

public double generateBillAmount(double amount)
{
double x= amount-(0.3*amount);
return x;
}

}
