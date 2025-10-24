package com.demo.customException;
// custom Exception
public class WrongOperatorException extends Exception {

	// making the constructor
	public WrongOperatorException(String msg) {
		super(msg);
//		System.out.println(msg);
	}
	
}
