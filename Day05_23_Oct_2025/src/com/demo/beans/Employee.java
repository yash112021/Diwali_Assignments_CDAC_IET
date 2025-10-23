package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable, Comparable{

	
	// data Members of the Emplyeee
	private String ename;
	private int eid;
	private String eemplrole;
	
	
	// default constructor 
	public Employee() {
		super();
	}

	// constructor where the employee role is harcoded  and only accepts the empyee name and emplyee id
	public Employee( int eid ,String ename) {
//		super();
		this.ename = ename;
		this.eid = eid;
		// hard coded
		this .eemplrole="Software Developer";
	}
	
	// construtor which accept all the value
	public Employee( int eid,String ename, String eemplrole) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.eemplrole = eemplrole;
	}
	
	// getters and setters  

	

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEemplrole() {
		return eemplrole;
	}

	public void setEemplrole(String eemplrole) {
		this.eemplrole = eemplrole;
	}

	// to String Method ;;
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", eemplrole=" + eemplrole + "]";
	}

	// adding the comppare to the default to id
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;   // casting of the Employee
		return Integer.compare(this.eid, e.eid);
	}
	
	
	
	
	
	
}
