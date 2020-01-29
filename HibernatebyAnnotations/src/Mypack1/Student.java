package Mypack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentd1")
public class Student {
	@Id
	@Column(name="stid")
private int stdId;
	@Column(name="stname")
private String firstName;
	@Column(name="stlastname")
private String lastName;

public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
