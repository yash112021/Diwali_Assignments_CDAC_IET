package com.demo.dao;

public class DaoInterfaceImpl  implements DaoInterface{

	
	
	// additon of the first N Even Number
	@Override
	public int sumOfNEvenNum(int n) {
		// counter to count the n
		int count=0;
		int sum=0;
		while(count < n) {
			for(int i=0;i<=(n+n+1);i++) { // here we can go till the Integer.MAX_VALUE or we can use n+n+1
				if(i%2==0) {
					sum += i;
					count++;
				}
			}
			
		}
		
		// printing the N even numbers so that user can verify is answer //exra part
//	
//		for(int i=0;i<=(n+n+1);i++) {
//				if(i%2==0) {
//					System.out.print("i ");
//				}
//		}
//		
		return sum;
		
	}

	// logic part for finding the Nth odd number addition // not using the for loop directly using the counter
	@Override
	public int sumOfNOddNumbers(int n) {
		int cnt=0;
		int sum=0;
		int i=1;
		while (cnt < n) {
			if(i%2!=0) {
				sum+=i;  // adding the value into the sum
				i++;
				cnt++;   // if we get the odd number then add the it and increase the counter
			}else {
				i++;
			}
		}
		return sum;
	}

	
	// logic part to check whether a Number is palindrome 
	// reverse the Number and then compare with the enterd Number  121->121  palindrome
	//153-->351  //not a palindrome Number
	@Override
	public boolean chckPalindrome(int n) {
		int copyofn=n;
		// reverse the Number First
		int revnum=0;
		int rem=0;
		// breaking the number one by one
		while(n!=0) {
			// frist get the remainder
			rem=n%10;
			revnum =revnum*10 + rem;   // making of the new Number
			 n=n/10;  // update value after after removing the last digit
		
		}
		
		// now caomparing the botht the numbers reversed number and orignal one
		if(copyofn == revnum) {
			return true;
		}
		return false;
	}

	// implemnting the logic for reverse the Number
	@Override
	public int reversedNumber(int n) {
		
		int revnum=0;
		int rem=0;
		// using the while loop for reverse until we reach the zero condiion 
		while(n!=0) {
			//getting the one-one digit
			rem=n%10 ; // modulo gives the remaider
			n=n/10;  // after gettig the reaminder making the n short
			revnum=revnum*10+rem;  // updating the reversed number 
			 
		}
		
		return revnum;
	}

	// to check armstrong Number 
	@Override
	public boolean checkArmstrong(int arm) {
		// the armstrong number is 153 1*125*27  cube of separate then add it and gives us the same number 153 is armstrong number
		
		int copyn=arm;
		int arm1=0;
		while(copyn != 0) {
			int r = copyn%10;
			arm1 +=r*r*r;
			copyn =copyn/10;
		
		}
		if(arm==arm1) {
			return true;
		}
		
		return false;
	}

}
