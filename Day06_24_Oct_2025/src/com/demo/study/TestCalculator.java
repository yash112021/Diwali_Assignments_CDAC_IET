package com.demo.study;

import java.util.Scanner;

import com.demo.customException.WrongOperatorException;

// testing of the TestCalculator
public class TestCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		
		System.out.println("Enter the Operator +,-,/,*,%");
		String opter=sc.next();
		
		try {
			int result = ServiceCalculator.calculator(a,b,opter);
			System.out.println("The result is --->"+result );
		}catch(WrongOperatorException e) {
			System.out.println("Wrong Operator occured -->"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Erroor  occured "+e.getMessage());
		}

	}

}
