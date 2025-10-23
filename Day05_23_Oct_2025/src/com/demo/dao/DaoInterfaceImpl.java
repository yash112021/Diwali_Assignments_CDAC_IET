package com.demo.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class DaoInterfaceImpl implements DaoInterface {

	// now here for storing the data we are going to use the harcode data
		static List<Employee> lst;
		
		// now in the static part loading the pre-Data
		static {
			lst=new ArrayList<>();
			// creating the object of the Emplyee 
			Employee e1=new Employee(101,"yash","Frontend Developer");
			lst.add(e1);
			
			//and now direct adding 
			lst.add(new Employee(102,"shraddha","Trainee Software Engineer"));
			lst.add(new Employee(103,"Nayan","Associate Software Engineer"));
		}

		// adding the Employee in the list logic
		@Override
		public boolean addEmployee(Employee employee) {
			// adding the  emplyee object to the ArrayList
			return lst.add(employee);
		}

		// removing the Emlyee by the id 
		
		// now there are many ways of removing the employee form this one is the iterator, removeif,or by simply using the loop
//		 we will go with the remove if Method
		@Override
		public boolean removeEmplyeeById(int a) {
			return lst.removeIf(e-> e.getEid()==a);  // now this line will  if the employee id is equal then object gets removed
			
		}

		// show all the Emplyee
		@Override
		public List<Employee> showEmplyee() {
			
			return lst;
		}

		//sort by id by using the CompareTo on on Id
		@Override
		public void sortById() {
			Collections.sort(lst);
			// now priting the lst
			
//			lst.forEach(System.out.println());
			for(Employee e:lst) {
				System.out.println(e);
			}
			
		}

		// serach Emplyee by Empid
		@Override
		public Employee srchByEmplyeeId(int id) {
		return 	lst.stream().filter(e->e.getEid()==id).findFirst().orElse(null);
		
		}

		// finding the Emplyee by name 
		@Override
		public List<Employee> findEmplyeeByName(String name) {
			 return lst.stream()
	                  .filter(e -> e.getEname().equalsIgnoreCase(name))
	                  .collect(Collectors.toList());
		}

		// to save the data in the file 
		@Override
		public boolean saveFile() {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Emplyee.txt"))) {
	            oos.writeObject(lst);  // write the entire list to file
	            return true;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        }

		}
		
		
	
	
}
