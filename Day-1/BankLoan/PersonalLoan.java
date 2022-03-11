package day_1_assignments;

public class PersonalLoan {

	private int LoanAmount;
	private int NumberOfMonths;
	private String person;
	private double EMI;
	
	
	public PersonalLoan(int loan,int NumberOfMonths , String person , double EMI) {
	    
		this.LoanAmount = loan;
		this.NumberOfMonths =NumberOfMonths;
		this.person =person;
		this.EMI =EMI;
	}
	
	public double interest(int LoanAmount,int NumberOfMonths, double EMI) {
	    
		return (this.LoanAmount*this.NumberOfMonths*this.EMI)/12;
	}

	public int getLoanAmount() {
	    
		return LoanAmount;
	}

	public void setLoanAmount(int LoanAmount) {
	    
		this.LoanAmount = LoanAmount;
	}

	public int getNumberOfMonths() {
	    
		return NumberOfMonths;
	}

	public void setNumberOfMonths(int NumberOfMonths) {
	    
		this.NumberOfMonths = NumberOfMonths;
	}

	public String getPerson() {
	    
		return person;
	}

	public void setPerson(String person) {
	    
		this.person = person;
	}

	public double getPercentage() {
	    
		return EMI;
	}

	public void setPercentage(double EMI) {
	    
		this.EMI = EMI;
	}
	
	
	
}