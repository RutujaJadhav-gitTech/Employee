package com.rutuja.Employee;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {
 
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer empId;
  
  @Column
  private String fname;
  
  @Column
  private String lname;
  
  @Column
  private String mob;
  
  @Column
  private String sallary;
  
  @Column
  private String password;
//public Employee(String empId, String fname, String lname, String mob, String sallary, String password) {
//	super();
//	this.empId = empId;
//	this.fname = fname;
//	this.lname = lname;
//	this.mob = mob;
//	this.sallary = sallary;
//	this.password = password;
//}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
public String getSallary() {
	return sallary;
}
public void setSallary(String sallary) {
	this.sallary = sallary;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  

}
