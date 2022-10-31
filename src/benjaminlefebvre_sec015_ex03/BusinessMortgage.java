package benjaminlefebvre_sec015_ex03;

public class BusinessMortgage extends Mortgage{
	
	// Constructor
	public BusinessMortgage(int mortgageNumber, String customerName, double balance, double primeRate, int term) {
		super(mortgageNumber, customerName, balance, primeRate + 1, term);
	}
}
