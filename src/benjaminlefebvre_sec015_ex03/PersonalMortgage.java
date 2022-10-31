package benjaminlefebvre_sec015_ex03;

public class PersonalMortgage extends Mortgage {

	// Constructor
	public PersonalMortgage(int mortgageNumber, String customerName, double balance, double primeRate, int term) {
		super(mortgageNumber, customerName, balance, primeRate + 2, term);
	}
}
