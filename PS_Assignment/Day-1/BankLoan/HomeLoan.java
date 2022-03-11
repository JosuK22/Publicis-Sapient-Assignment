package day_1_assignments;

public class HomeLoan {

	private int loanAmount;
	private int numberOfMonths;
	private String person;
	private double EMI;
	
	public HomeLoan(int Loan,int numberOfMonths , String person , double EMI) {
	    
	    this.loanAmount = Loan;
		this.numberOfMonths =numberOfMonths;
		this.person =person;
		this.EMI =EMI;
	}

	public double interest(int loanAmount,int numberOfMonths, double EMI) {
	    
		return (this.loanAmount*this.numberOfMonths*this.EMI)/12;
		
	}
	
	public int getLoanAmount() {
	    
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
	    
		this.loanAmount = loanAmount;
	}

	public int getNumberOfMonths() {
	    
		return numberOfMonths;
	}

	public void setNumberOfMonths(int numberOfMonths) {
	    
		this.numberOfMonths = numberOfMonths;
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