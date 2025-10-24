package com.demo.study;

import com.demo.customException.WrongOperatorException;

public class ServiceCalculator {
	public static int  calculator(int a, int b, String opt) throws WrongOperatorException{
		
		// now using the switch case 
		switch(opt) {
		
		case "+"->{
			return a+b;
		}
		case "-"->{
			return a-b;
		}
		case "/"->{
			return a/b;
		}
		case "*"->{
			return a*b;
		}
		case "%"->{
			
			
			return a%b;
		}

		default->{
			throw new WrongOperatorException("you have Entered the wrong operator plesase Enterd valid opertator-->");
		}
				
		}
		
		
		
		
		
	}
}
