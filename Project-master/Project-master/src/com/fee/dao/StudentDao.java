package com.fee.dao;

import com.fee.beans.StudentBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentDao {
	
public static int save(StudentBean bean){
	int status=0;
	try{
		Connection con=DB.getCon();
		PreparedStatement ps=con.prepareStatement("insert into fee_student(name,email,course,fee,paid,due,address,contact,rollno) values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1,bean.getName());
		ps.setString(2,bean.getEmail());
		ps.setString(3,bean.getCourse());
		ps.setInt(4,bean.getFee());
		ps.setInt(5,bean.getPaid());
		ps.setInt(6,bean.getDue());
		ps.setString(7,bean.getAddress());
		ps.setString(8,bean.getContact());
		ps.setInt(9,bean.getRollno());
		status=ps.executeUpdate();
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}
public static int update(StudentBean bean){
	int status=0;
	try{
		Connection con=DB.getCon();
		PreparedStatement ps=con.prepareStatement("update fee_student set name=?,email=?,course=?,fee=?,paid=?,due=?,address=?,contact=? where rollno=?");
		ps.setString(1,bean.getName());
		ps.setString(2,bean.getEmail());
		ps.setString(3,bean.getCourse());
		ps.setInt(4,bean.getFee());
		ps.setInt(5,bean.getPaid());
		ps.setInt(6,bean.getDue());
		ps.setString(7,bean.getAddress());
		ps.setString(8,bean.getContact());
		ps.setInt(9,bean.getRollno());
		status=ps.executeUpdate();
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}	
public static int delete(int rollno){
	int status=0;
	try{
		Connection con=DB.getCon();
		PreparedStatement ps=con.prepareStatement("delete from fee_student where rollno=?");
		ps.setInt(1,rollno);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}
public static int deleteByName(String name){
	int status=0;
	try{
		Connection con=DB.getCon();
		PreparedStatement ps=con.prepareStatement("delete from student where name=?");
		ps.setString(1,name);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}

public static List<StudentBean> getAllRecords(){
	List<StudentBean> list=new ArrayList<StudentBean>();
	try{
		Connection con=DB.getCon();
		PreparedStatement ps=con.prepareStatement("select * from fee_student");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			StudentBean bean=new StudentBean();
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setEmail(rs.getString(3));
			bean.setCourse(rs.getString(4));
			bean.setFee(rs.getInt(5));
			bean.setPaid(rs.getInt(6));
			bean.setDue(rs.getInt(7));
			bean.setAddress(rs.getString(8));
			bean.setContact(rs.getString(9));
			list.add(bean);
		}
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return list;
}
public static List<StudentBean> getDues(){
	List<StudentBean> list=new ArrayList<StudentBean>();
	try{
		Connection con=DB.getCon();
		PreparedStatement ps=con.prepareStatement("select * from fee_student where due>0");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			StudentBean bean=new StudentBean();
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setEmail(rs.getString(3));
			bean.setCourse(rs.getString(4));
			bean.setFee(rs.getInt(5));
			bean.setPaid(rs.getInt(6));
			bean.setDue(rs.getInt(7));
			bean.setAddress(rs.getString(8));
			bean.setContact(rs.getString(9));
			list.add(bean);
		}
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return list;
}

public static StudentBean getRecordByRollno(int rollno){
	StudentBean bean=new StudentBean();
	try{
		Connection con=DB.getCon();
		PreparedStatement ps=con.prepareStatement("select * from fee_student where rollno=?");
		ps.setInt(1,rollno);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setEmail(rs.getString(3));
			bean.setCourse(rs.getString(4));
			bean.setFee(rs.getInt(5));
			bean.setPaid(rs.getInt(6));
			bean.setDue(rs.getInt(7));
			bean.setAddress(rs.getString(8));
			bean.setContact(rs.getString(9));
		}
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return bean;
}

}