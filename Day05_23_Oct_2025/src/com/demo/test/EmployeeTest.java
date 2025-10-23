package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.ServiceInterface;
import com.demo.service.ServiceInterfaceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// creating the object of the Service class with its inteface
		ServiceInterface eserv=new ServiceInterfaceImpl();
		
		// now using the do while for the menu 
		int choice=0;
		do {
			
			System.out.println("\n 1.Add Employee to list \n 2.Remove Employee list \n 3.Show all Employee");
			System.out.println(" \n 4.Show all Employee in sorted order \n 5.Find emplyee By ID \n 6.Find a Employee with empName");
			System.out.println(" \n 7.Save all Employees into file \n 8.Quit");
			
			System.out.println("Enter your choice ");
			choice =sc.nextInt();
			
			// now using the switch case
			switch (choice) {
			
			case 1->{
				// adding the Employee in the list 
				// now it will give the stattus whether the employee is added or not 
				boolean status=eserv.addNewEmplyee();
				if(status) {
					System.out.println("Emplyee addded Succesfully  -->>");
				}
				else {
					System.out.println("Failed to add the Emplyee");
				}
			}
			case 2->{
				// removing the Employee form the list 
				System.out.print("Enter the Employee id To  remove that Employee -->") ;
				int a=sc.nextInt();
				// now it will also return us the status whether that emplyee is removed or not
				boolean status = eserv.removeEmplyeById(a);
				if(status) {
					System.out.println("Emplyee removed Succesfully");
				}else {
					System.out.println("Emplyee doesn't Exits");
				}
				
				
			}
			case 3->{
				// now showing all the Emplyee in the list
				// now  we will require the array list it will return us 
				List<Employee> lst1=eserv.showallEmplyee();
				if(lst1!=null) {
					// now using the forEach loop to the list to diplay the Emplyee
					lst1.forEach(System.out::println);
				}else {
					System.out.println("list is Empty");
				}
				
			}
			case 4->{
				// sorting by using the Employee id 
				eserv.sortById();
			}
			case 5->{
				// now finding the Employee  by the id
				System.out.print("Enter the Employee id --> ");
				int id=sc.nextInt();
				// now it will return us a particular object 
				Employee e=eserv.searchemplyeeById(id);
				System.out.println(e);
				
			}
			case 6->{
				//find the Emplyee by the name 
				System.out.println("Enter the Emplyee name");
				String name=sc.next();
				// now this it will return us list becoz same name multiple emplyee may also exits
				List <Employee> namelst=eserv.findEmplyeeByName(name);
				if(namelst!=null) {
					// now using the forEach loop to the list to diplay the Emplyee
					namelst.forEach(System.out::println);
				}else {
					System.out.println("list is Empty");
				}

			}
			case 7->{
				 boolean saved = eserv.saveAllEmployeesToFile();
                 if (saved)
                     System.out.println("💾 Employees saved successfully to file!");
                 else
                     System.out.println("❌ Error saving employees to file.");
			}
			case 8->{
				System.out.println("Thankyou For Visting ...");
			}
//			
			}
			
			
		} while(choice != 8);
		
	}

}
