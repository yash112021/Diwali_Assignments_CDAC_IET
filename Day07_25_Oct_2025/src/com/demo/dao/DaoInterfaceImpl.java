package com.demo.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.CustomExp.LowAttendanceException;
import com.demo.beans.Student;

public class DaoInterfaceImpl  implements DaoInterface{
		
	// now creating the arraylist to store the Student Object
	static List<Student> lst;
	// static block 
	static {
		
		lst=new ArrayList<>();
		
	}
	// loading the data from the text file
	// default constructor 
	@SuppressWarnings("unchecked")
	public DaoInterfaceImpl() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))) {
            lst = (List<Student>) ois.readObject();
            System.out.println(" Loaded existing students from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" No existing data found.");
        }
	}
	@Override
	public boolean addNewStudent(Student student) {
		try {
            if (student.getAttendPer() < 60) {
                throw new LowAttendanceException("Attendace is below the 60 %: " + student.getSname());
            }
            // adding the student
            lst.add(student);
                 return true;

        } catch (LowAttendanceException e) {
            System.out.println(e.getMessage());
            return false;
        }
	}
	
	// displaying all the student
	@Override
	public List<Student> disallStd() {
		
		return lst;
	}
	
	
	// now here we are going to use comparator 
	@Override
	public List<Student> sortByAttendper() {
		lst.sort((a, b) -> Double.compare(b.getAttendPer(), a.getAttendPer()));
		return lst;
	}
	
	// save all data 
	@Override
	public void saveAll() {
		 try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
	            oos.writeObject(lst);
	        } catch (IOException e) {
	            e.printStackTrace();
	     }
		
	}
	
	
	
	
}
	
	

