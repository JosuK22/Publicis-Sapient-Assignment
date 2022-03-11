package day_1_assignments;

import java.util.Scanner;

public class TestingMethodOverloading {

	public void hello(int i) {
	    
		System.out.println("Data Type of "+i+" is Int"); 
	}
	
	public void hello(double i) {
	    
		System.out.println("Data Type of "+i+" is Double"); 
	}
	
	public void hello(byte i) {
	    
		System.out.println("Data Type of "+i+" is Byte");
	}
	
	public void hello(short i) {
	    
		System.out.println("Data Type of "+i+" is Short");
	}
	
	public void hello(long i) {
	    
		System.out.println("Data Type of "+i+" is Long");
	}
	
	
	public static void main(String[] args) {
		
	TestingMethodOverloading TML =new TestingMethodOverloading();
		
		//Scanner sc = new Scanner(System.in);
		
		
		
		TML.hello(5);
		
		TML.hello(1.0);
		
		
	}

}