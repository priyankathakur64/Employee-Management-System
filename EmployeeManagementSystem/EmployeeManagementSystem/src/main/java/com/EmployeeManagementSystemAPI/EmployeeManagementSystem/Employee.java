package com.EmployeeManagementSystemAPI.EmployeeManagementSystem;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String fname;
	private String lname;
	private String DOB;
	private String Dept;
	private String position;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String fname, String lname, String dOB, String dept, String position, double salary) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		DOB = dOB;
		Dept = dept;
		this.position = position;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", DOB=" + DOB + ", Dept=" + Dept
				+ ", position=" + position + ", salary=" + salary + "]";
	}
}
