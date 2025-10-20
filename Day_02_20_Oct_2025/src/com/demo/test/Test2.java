package com.demo.test;

import java.util.Scanner;

import com.demo.service.ServiceInteface;
import com.demo.service.ServiceInterfaceImpl;


// Day 2 Diwali Assignmnet
public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// making object of the Service class with the interface the refernece one 
		ServiceInteface eserv = new ServiceInterfaceImpl();
		
		int choice=0;
		
		do {
			
			System.out.println("\n 1.Sum of First n Even Numbers \n 2.Sum of first n odd numbers ");
			System.out.println("\n 3.Check if a number is a palindrome \n 4.Check if a number is an Armstrong number");
			System.out.println("\n 5.Reverse a number \n6. Exit " );
			
			
			// now using the switch case
			choice =sc.nextInt();
			
			switch(choice) {
					// to find the sum of first Even number 
				case 1->{
					// taking the  n number from the user
					System.out.println("Enter the N Number for Even Number additon");
					int n=sc.nextInt();
					int res =  eserv.addEvenNoTillNumber(n);
					if(res >= 0) {
						System.out.println("*** The addition of the first Nth "+ n+" Even Number is --> "+res);
					}else {
						System.out.println("Something gone wrong");
					}
					
					
				}
				
				
				case 2->{
					// addition of N odd Numbers 
					System.out.print("Enter the Nth Number for addition of odd numbers--> " );
					int n=sc.nextInt();
					int res =  eserv.addOddNoTillNumber(n);
					if(res >= 0) {
						System.out.println("*** The addition of the first Nth "+ n+" Odd Number is --> "+res);
					}else {
						System.out.println("Something gone wrong");
					}
					
					
					
				}
				
				case 3->{
					// now to check whether a Number is palindrome or not then 
					System.out.println("Enter the Poisitve Integer");
					int n=sc.nextInt();
					boolean status=eserv.checkPalindrome(n);
					if(status) {
						System.out.println("The Entered Number -- > "+n+" is Palindrome");
					}else {
						System.out.println("NOT a Palindrome");
					}
				}
				
				case 4->{
					// To checked the Number is Armstrong number 
					System.out.print("Enter the Number to be checked Wether Armstron or not  -->");
					int  arm=sc.nextInt();
					// it will return the status t/f for Armstrong Number
					boolean status =eserv.checkarmstrong(arm);
					if(status) {
						System.out.println("The Entered Number --" +arm+" is a ArmStrongNumber " );
					}else {
						System.out.println("NOT a Armstrong Numnber");
					}
				}
				
				
				case 5->{
					// reversed a given integer 
					System.out.println("Enter the Integer to be reversed -->");
					int n=sc.nextInt();
					int res=eserv.reversedNum(n);
					System.out.println("The Reversed Number -->"+res);
				}
				case 6->{
					System.out.println("******************Thankyou for Visiting **************");
					
				}
				
				
			}
			
			
			
		} while (choice != 6);

	}

}
 