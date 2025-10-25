package com.demo.CustomExp;

// user defined exception for  low addatnace 
public class LowAttendanceException extends Exception {

	public LowAttendanceException(String msg) {
		super(msg);
	}
	
}
