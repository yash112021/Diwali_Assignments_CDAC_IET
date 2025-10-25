package com.demo.beans;
// Student Class
public class Student implements Comparable <Student>{
	private int roll_no;
	private String sname;
	private String course;
	private double attendPer;
	private double score;
	
	
	// default contuctor 
	public Student() {
		super();
	}

	
	// parmaterised constructor 

	public Student(int roll_no, String sname, String course, double attendPer, double score) {
		super();
		this.roll_no = roll_no;
		this.sname = sname;
		this.course = course;
		this.attendPer = attendPer;
		this.score = score;
	}

	// setters and getters

	public int getRoll_no() {
		return roll_no;
	}

	// to string method 
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", sname=" + sname + ", course=" + course + ", attendPer=" + attendPer
				+ ", score=" + score + "]";
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public double getAttendPer() {
		return attendPer;
	}


	public void setAttendPer(double attendPer) {
		this.attendPer = attendPer;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	@Override
	public int compareTo(Student o) {
		// typecasting 
//		Employee e = (Employee) o;   
		Student e=(Student) o;
		  return Double.compare(this.getAttendPer(), e.getAttendPer());
	}
	
	
	
		
	
}
