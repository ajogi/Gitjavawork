package com.hcl.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee 
{
 String empId;
 String empName;
 String desig;
 String city;
 //getters and setters   
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
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
  public static Employee getEmployee(String empId)
  {
	  Employee e = new Employee();
	  String userid="system";
	  String password="system";
	  String url="jdbc:oracle:thin:@localhost:1521/xe";
	  Connection con;
	  Statement stmt;
	  String qry;
	  ResultSet rs;
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con=DriverManager.getConnection(url,userid,password);
		  stmt=con.createStatement();
		  qry="SELECT * FROM hclemp WHERE empid='"+ empId +"'";  
		  		rs=stmt.executeQuery(qry);
		  e.setEmpId(empId);
		  if(rs.next())
		  {
			  e.setEmpName(rs.getString("EmpName"));
			  e.setDesig(rs.getString("Desig"));
			  e.setCity(rs.getString("City"));
		  }
		  else
		  {
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

		  System.err.println("SQLException: "+ ex.getMessage());
	  
		  
	  }
	  return e;
	  	  
  }
 
}
