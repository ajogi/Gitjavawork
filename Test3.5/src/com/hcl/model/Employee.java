package com.hcl.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Employee {
String empID;
String empName;
String desig;
String city;
public String getEmpID() {
	return empID;
}
public void setEmpID(String empID) {
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public static Employee getEmployee(String empID) {
Employee e = new Employee();
String userid="jogi";
String password = "rao";
String url = "jdbc:oracle:thin:@localhost:1521/XE";
Connection con;
Statement stmt;
String qry;
ResultSet rs;
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection(url, userid, password);
stmt= con.createStatement();
qry="SELECT * FROM HclEmp WHERE EmpID='" + empID + "'";
rs = stmt.executeQuery(qry);
e.setEmpID(empID);
if(rs.next()) {
e.setEmpName(rs.getString("EmpName"));
e.setDesig(rs.getString("Desig"));
e.setCity(rs.getString("City"));
} else {
e.setEmpName("not found");
e.setDesig("not found");
e.setCity("not found");
}
stmt.close();
con.close();
} 
catch(java.lang.ClassNotFoundException ex) {
System.out.println("Oracle Driver not found");
}
catch(SQLException ex) {
System.err.println("SQLException: " + ex.getMessage());
}
return e;
}
}

