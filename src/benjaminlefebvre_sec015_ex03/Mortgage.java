package benjaminlefebvre_sec015_ex03;

public abstract class Mortgage implements MortgageConstants {
	private int mortgageNumber;
	private String customerName;
	private double balance;
	private double interestRate;
	private int term;
	
	// Constructor
	public Mortgage(int mortgageNumber, String customerName, double balance, double interestRate, int term) {
		setMortageNumber(mortgageNumber);
		setCustomerName(customerName);
		setBalance(balance);
		setInterestRate(interestRate);
		setTerm(term);
	}
	
	// Getters 
	public int getMortageNumber() {
		return mortgageNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public int getTerm() {
		return term;
	}
	
	// Setters 
	public void setMortageNumber(int mortgageNumber) {
		this.mortgageNumber = mortgageNumber;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setBalance(double balance) {
		if (balance <= MAX_AMT && balance > 0) {
			this.balance = balance;
		} else {
			throw new IllegalArgumentException("Mortgage balance needs to be between 0 and 300K.");
		}
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void setTerm(int term) {
		if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
			this.term = term;
		} else {
			this.term = SHORT_TERM;
		}
	}
	
	// Display info
	public void getMortgageInfo() {
		System.out.println("\n-----------------------------------");

		System.out.println("Mortgage Number: " + mortgageNumber);
		System.out.println("Customer Name  : " + customerName);
		System.out.printf("Balance        : $%.2f%n", balance);
		System.out.println("Interest Rate  : " + interestRate + "%");
		System.out.println("Mortgage Term  : " + term + " year(s).");

		System.out.println("-----------------------------------");
	}
}
