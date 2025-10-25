package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface DaoInterface {

	boolean addNewStudent(Student student);

	List<Student> disallStd();

	List<Student> sortByAttendper();

	void saveAll();

}
