package benjaminlefebvre_sec015_ex01;

public class Health extends Insurance {

	// Constructors
	public Health() {
		super("Health");
	}
	
	public Health(double monthlyFee) {
		super("Health", monthlyFee);
	}
	
	// Abstract classes override 
	@Override
	public void setInsuranceCost(double insuranceCost) {
		super.setMonthlyCost(insuranceCost);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("\nInsurance Details:");
		System.out.println("Insurance Type: " + getInsuranceType() + " insurance");
		System.out.printf("Monthly cost: $%.2f%n", getMonthlyCost());
	}
}
