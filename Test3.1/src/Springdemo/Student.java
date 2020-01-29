package Springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;
	private String marks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Autowired
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	} 
	public String getmarks() {
		return marks;
	}
	public void setmarks(String marks) {
		this.marks = marks;
	}
	

}
