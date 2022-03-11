package day_1_assignments;


public class Factorial {
	
	public void byForLoop(int n) {
	    
		double fact=0;
		for (int i = n; i>0; i--) {
		    
			fact=fact*i;
		}
		System.out.println("Factorial of the number "+ n +" using forLoop : "+ fact);
	}
	
	public void byWhileLoop(int n) {
		double fact=0;
		int i=1;
		
		while (i<=n) {
		    
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of the number "+ n +" using while loop "+ fact);
	}
	
}
