package org.com.demo.client;

import org.demo.tools.Calculator;

public class MathTester {

	public static void main(String[] args) {
	    
		Calculator calculator=new Calculator(400, 30);
		
		System.out.println(calculator.add());
		
		System.out.println(calculator.subtract());
		
		System.out.println(calculator.multiply());
		
	}

}
