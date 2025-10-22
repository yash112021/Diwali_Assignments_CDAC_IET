package com.demo.service;

import com.demo.dao.DaoInterface;
import com.demo.dao.DaoInterfaceImpl;

public class ServiceInterfaceImpl implements ServiceInterface {

	// making the object of the dao class
	DaoInterface edao;
	
	// default constructor
	public ServiceInterfaceImpl() {
//		super();
		edao = new DaoInterfaceImpl();
	}


	// additon of two Numbers
	@Override
	public int addTwoNumber(int a, int b) {
	
		return edao.addtwoNum(a,b);
	}

	// print the table
	@Override
	public void printTable(int a) {
		edao.printTable(a);
	}

	// printing the patterns 
	@Override
	public void patterns(int n) {
		edao.printPatterns(n);
		
	}

	// addition of the N Numbers 
	@Override
	public int addNNumber(int a) {
		
		return edao.sumOfAllDigits(a);
	}


	// finding the gcd and lcm
	@Override
	public int[] findGCD_LCM(int a, int b) {
		return edao.findgcd_lcm(a,b);
	}

}
