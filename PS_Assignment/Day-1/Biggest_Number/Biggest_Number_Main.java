package day_1_assignments;

public class Biggest_Number_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biggest_Number big=new Biggest_Number();
		System.out.println("Biggest number is " + big.findBiggest(1000, 100, 10));
		
		System.out.println("Biggest number is " + big.findBiggest(50, 97, 123));
		
		System.out.println("Biggest number is " + big.findBiggest(8, 100, 65));
		
		System.out.println("Biggest number is " + big.findBiggest(675, 76,456));
		
		System.out.println("Biggest number is " + big.findBiggest(566, 2569, 4768));

	}

}
