package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.DaoInterface;
import com.demo.dao.DaoInterfaceImpl;

public class ServiceInterfaceImpl implements ServiceInterface {

	Scanner sc=new Scanner(System.in);
	DaoInterface edao;

	// default constructor 
	public ServiceInterfaceImpl() {
//		super();
		edao = new DaoInterfaceImpl();  // creating the object of the dao in the constructor 
	}

	// adding the new Employee
	@Override
	public boolean addNewEmplyee() {
		System.out.print("Enter the Employee Id--> ");
		int n=sc.nextInt();
		System.out.println("Enter the Employee Name --> ");
		String nm=sc.next();
		return  edao.addEmployee(new Employee(n,nm));
		
	}

	// removing the Emplyee by id
	@Override
	public boolean removeEmplyeById(int a) {
		
		return edao.removeEmplyeeById(a);
	}

	// showing all the Emplyee
	@Override
	public List<Employee> showallEmplyee() {
	
		return edao.showEmplyee();
	}

	// sort By ID
	@Override
	public void sortById() {
		edao.sortById();
		
	}

	//serach Emplyee by the id 
	@Override
	public Employee searchemplyeeById(int id) {
		
		return edao.srchByEmplyeeId(id);
	}

	// find the Emplyee by name 
	@Override
	public List<Employee> findEmplyeeByName(String name) {
		
		return edao.findEmplyeeByName(name);
	}

	@Override
	public boolean saveAllEmployeesToFile() {
		
		return edao.saveFile();
	}
	
}
