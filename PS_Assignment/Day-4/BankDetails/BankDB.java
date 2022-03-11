package assignmentDay4;

public class BankDB {
    
	static Map<Integer,BankCustomer> bankDB;
	
	static {
	    
		bankDB=new HashMap<Integer, BankCustomer>();
		
		bankDB.put(100061, new BankCustomer(100061,"John","Delhi",15000.0));
		bankDB.put(100076, new BankCustomer(100076,"Peter","Goa",10000.0));
		bankDB.put(100079, new BankCustomer(100079,"Jain","Chennai",18500.0));
		bankDB.put(100069, new BankCustomer(100069,"Krishna","Jaipur",25000.0));
		bankDB.put(100889, new BankCustomer(100889,"Harbajan","Punjab",18500.0));
		bankDB.put(100519, new BankCustomer(100519,"Ameer","Meerut",30500.0));
		bankDB.put(100979, new BankCustomer(100979,"Vinay","Assam",12500.0));
		bankDB.put(190079, new BankCustomer(190079,"Silvester","Nagaland",18500.0));
		bankDB.put(197079, new BankCustomer(197079,"Dhoni","Ranchi",21000.0));
		bankDB.put(199077, new BankCustomer(199077,"Kishan","Manipur",22000.0));
	}
}