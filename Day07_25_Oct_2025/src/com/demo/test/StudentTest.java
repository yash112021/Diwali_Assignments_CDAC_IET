package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.ServiceInterface;
import com.demo.service.ServiceInterfaceImpl;

public class StudentTest {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//creating the obejct of the service 
			ServiceInterface eserv=new ServiceInterfaceImpl();
			// adding the 10 Students by user 
			
			int choice =0;
			do {
				
				System.out.println("\n1. add New Student--> \n2. Display All Student");
				System.out.println("3. sort by attendacne \n4.  exit");
			System.out.println("Enter the Choice --");
			choice =sc.nextInt();
			
			switch(choice) {
			
			case 1->{
				boolean status =eserv.addnewStudent();
				if(status) {
					System.out.println("The Student added -->");
				}
				else {
					System.out.println("Student not added ");
				}
			}
			case 2->{
				List<Student> lst=eserv.displayallStudent();
				if(lst!=null) {
					// displaying by using the foreach loop
					lst.forEach(System.out::println);
				}
				else {
					System.out.println("NO Student");
				}
			}
			case 3->{
				// display student by decreasing order in descending form  
				List<Student> lst=eserv.sortByattPer();
				if(lst!=null) {
					// displaying by using the foreach loop
					lst.forEach(System.out::println);
				}
				else {
					System.out.println("NO Student");
				}
			}
			case 4->{
				System.out.println("thankyou for visting");
				eserv.saveall();
			}
			
			}
			
					
			}while(choice !=4);
			
	}

}
