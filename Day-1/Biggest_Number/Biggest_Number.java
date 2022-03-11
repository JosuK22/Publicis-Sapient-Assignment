package day_1_assignments;

public class Biggest_Number {
	
	public int findBiggest(int a,int b,int c) {
		
		if(a>b && a>c) {
			
			return a;
			
		}
		else if(b>a && b>c) {
			
			return b;
			
		}
		else {
			
			return c;
		}
	}
}
