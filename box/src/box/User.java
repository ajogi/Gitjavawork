package box;
public class User
{
private String name,username,passwd;
   
private  ContactDetail conde;
public User(String name, String username, String passwd,ContactDetail conde) {
super();
this.name = name;
this.username = username;
this.passwd = passwd;
this.conde = conde;
}
public User() {
// TODO Auto-generated constructor stub
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPasswd() {
return passwd;
}
public void setPasswd(String passwd) {
this.passwd = passwd;
}
public ContactDetail getContactDetail() {
return conde;
}
public void setContactDetail(ContactDetail conde) {
this.conde = conde;
}
@Override
public String toString() {
return "User Name:" + name + ", Username:" + username + ", Password=" + passwd + ", Contactdetil:" + conde + "";
}


}
