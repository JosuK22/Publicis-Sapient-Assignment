package day_1_assignments;

import java.util.Scanner;

public class FactorialMain {
	
	public static void main(String[] args) {
	    
		Factorial fa=new Factorial();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		
		int num = sc.nextInt();
		
		fa.byForLoop(num);
		
		fa.byWhileLoop(num);
	}

}