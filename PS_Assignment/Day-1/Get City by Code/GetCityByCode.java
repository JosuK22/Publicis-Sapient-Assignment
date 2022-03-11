package day_1_assignments;

import java.util.Scanner;

public class GetCityByCode {	
    
	public String GetCityByCode(int a) {
	    
		switch(a) {
		    
			case 1 : 
			    return "Delhi";
			
			case 2 : 
			    return "NOIDA";
			
			case 3 : 
			    return "GUARGAON";
			
			case 4 : 
			    return "BANGALORE";
			
			default : 
			return "INVALIDCODE";
			
	    }
	    
	}
	

	public static void main(String[] args) {
	    
		City city = new City();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Code Number :");
		int code = sc.nextInt();
		
		System.out.println(city.GetCityByCode(code));

	}

}