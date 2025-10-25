package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface ServiceInterface {

	boolean addnewStudent();

	List<Student> displayallStudent();

	List<Student> sortByattPer();

	void saveall();

}
