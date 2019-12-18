package box;

public class ContactDetail
{
    private String mobile,altmobile,landline,email,address;
   
ContactDetail(){}

public ContactDetail(String mobile, String altmobile, String landline, String email, String address) {
super();
this.mobile = mobile;
this.altmobile = altmobile;
this.landline = landline;
this.email = email;
this.address = address;
}



public String getMobile() {
return mobile;
}

public void setMobile(String mobile) {
this.mobile = mobile;
}

public String getAltmobile() {
return altmobile;
}

public void setAltmobile(String altmobile) {
this.altmobile = altmobile;
}

public String getLandline() {
return landline;
}

public void setLandline(String landline) {
this.landline = landline;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}



@Override
public String toString() {
return "Contact detail:\nMobile:" + mobile + "\nAlternate mobile:" + altmobile + "\nLandLine:" + landline + "\nEmail:"
+ email + "\nAddress:" + address + "";
}

}