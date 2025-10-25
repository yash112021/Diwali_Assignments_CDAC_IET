package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.DaoInterface;
import com.demo.dao.DaoInterfaceImpl;

public class ServiceInterfaceImpl implements ServiceInterface{

	DaoInterface edao;
	static int rollno=1;
	
	// constructor of the service and creating object of the dao in the 
	
	public ServiceInterfaceImpl() {
		//		super();
		edao = new DaoInterfaceImpl();
	}




	Scanner sc=new Scanner(System.in);



	// adding the new Student -->
	@Override
	public boolean addnewStudent() {
		int rll=rollno;
		rollno++;
		
		System.out.println("Enter the Student name --->");
		String nm=sc.next();
		
		System.out.println("Enter the Course name-->");
		String cs=sc.next();
		
		System.out.println("Enter the Attendance in percentage");
		double att=sc.nextDouble();
		
		System.out.println("Enter the Student Score in percantage");
		double per=sc.nextDouble();
		
		
		
		// now creating the object of the employee
		
		
		return edao.addNewStudent(new Student(rll,nm,cs,att,per));
	}



	// display all the Student
	@Override
	public List<Student> displayallStudent() {

		return edao.disallStd();
	}

	// sort by addentance percentage

	@Override
	public List<Student> sortByattPer() {
		
		return edao.sortByAttendper();
	}


	// saving the data 
	@Override
	public void saveall() {
		// saving the data
		edao.saveAll();
		
	}

}
