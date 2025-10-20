package com.demo.service;

import com.demo.dao.DaoInterface;
import com.demo.dao.DaoInterfaceImpl;

public class ServiceInterfaceImpl implements ServiceInteface{
		// making the object of Daoclass with its interface  in the constructor of these class
		
			DaoInterface edao ;
			
		// default constructor 
		public ServiceInterfaceImpl() {
//			super();
			edao =new  DaoInterfaceImpl();
		}

		
		// finding the addition of the first n even Numbers
		@Override
		public int addEvenNoTillNumber(int n) {
			
			return edao.sumOfNEvenNum(n);
		}

		// addion of n odd Numbers
		@Override
		public int addOddNoTillNumber(int n) {

			return edao.sumOfNOddNumbers(n);
		}

		// to check whether a Number is Palindrome or return true or false
		@Override
		public boolean checkPalindrome(int n) {
	
			return edao.chckPalindrome(n);
		}

		// Reversed the Number 
		@Override
		public int reversedNum(int n) {
	
			return edao.reversedNumber(n);
		}

		// armstrong number 
		@Override
		public boolean checkarmstrong(int arm) {
		
			return edao.checkArmstrong(arm);
		}
	
}
