package assignmentDay2;

import java.util.Scanner;

public class FiguresMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1]Triangle , [2] Rectangle");
		System.out.print("Enter the choice Number :");
		int choice = sc.nextInt();
		
		sc.close();
		
		//Triangle Area
		if(choice ==1) {
			Figures triangle =new Triangle(20,30);
			System.out.println("Area of Triangle ="+" "+triangle.area());
		}
		
		//Rectangle Area
		else if(choice == 2) {
			Figures rectangle = new Rectangle(10,20);
			System.out.println("Area of Rectangle ="+" "+rectangle.area());
		}
		else {
			System.out.println("Invalid Input...");
		}
	}

}