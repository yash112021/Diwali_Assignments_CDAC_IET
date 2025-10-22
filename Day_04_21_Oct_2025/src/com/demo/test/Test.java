package com.demo.test;

import java.util.Scanner;

import com.demo.service.ServiceInterface;
import com.demo.service.ServiceInterfaceImpl;

public class Test {
	public static void main(String args[]) {
		// making the obejct of the service class with its inteface 
		ServiceInterface eserv=new ServiceInterfaceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
			
			System.out.println("\n 1.Addition of two numbers \n 2.Print multiplication table of a number");
			System.out.println(" \n 3. Print number pattern (e.g., triangle, pyramid) \n 4. Sum of digits of a number");
			System.out.println("\n 5. Find GCD and LCM of two numbers \n 6.exit ");
			
			System.out.print("Enter the your hoice ---> ");
			choice =sc.nextInt();
			
			
			// now using the switch case 
			switch (choice) {
			
			case 1->{
				// addtion of two Numbers
				System.out.println("Enter the Two Number to Perform the addition");
				int a=sc.nextInt();
				int b=sc.nextInt();
				// now this function will gives us the result in the integer in this form
				int res = eserv.addTwoNumber(a,b);
				System.out.println("The addition of two Numbers -->" + res);
				
				
			}
			case 2->{
				// printing the table get the number from the user
				System.out.println("Enter the Number to get the table -->");
				int a=sc.nextInt();
				// just calling the function
				eserv.printTable(a); // calling the fucntion
				
			}
			case 3->{
				// printing the   pattern the traingle and the pyrmaind
				System.out.println("Enter the value of n get the pyrmaid and traingle pattern ");
				int n=sc.nextInt();
				// it will also return us nothing 
				eserv.patterns(n);
				
				
			}
			case 4->{
				// sum of the digits
				System.out.print("Enter the the value of n--> ");
				int a=sc.nextInt();
				// now it will give the result in the form of the number
				int res=eserv.addNNumber(a);
				System.out.println("The addtion of the Number is -->"+res);
			}
			case 5->{
				// finding the GCD and LCM for that you need two Number 
				// GCD->Greatest common factor     LCM -> Least Common Multiple
				System.out.println("Enter the Two Numbers  a nd b");
				int a=sc.nextInt();
				int b=sc.nextInt();
				// now it will return use the two values the GCD and LCM only two values function can wriiten only one value
				// so we will require the array
				int ab[]=eserv.findGCD_LCM(a,b);
				if(ab!=null) {
					System.out.println("The GCD is ---> "+ab[0]);
					System.out.println("THE LCM is --> "+ab[1]);
				}
				else {
					System.out.println("unable to  find");
				}
			}
			case 6->{
				System.out.println("ThankYou for Visting...");
			}
			
			}
			
		} while (choice !=6);
	}
}
