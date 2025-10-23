package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface DaoInterface {

	boolean addEmployee(Employee employee);

	boolean removeEmplyeeById(int a);

	List<Employee> showEmplyee();

	void sortById();

	Employee srchByEmplyeeId(int id);

	List<Employee> findEmplyeeByName(String name);

	boolean saveFile();

	
	
	
	
}
