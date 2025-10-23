package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface ServiceInterface {

	boolean addNewEmplyee();

	boolean removeEmplyeById(int a);

	List<Employee> showallEmplyee();

	void sortById();

	Employee searchemplyeeById(int id);

	List<Employee> findEmplyeeByName(String name);

	boolean saveAllEmployeesToFile();

}
