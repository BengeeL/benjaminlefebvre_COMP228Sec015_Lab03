package benjaminlefebvre_sec015_ex01;

public abstract class Insurance {
	private String insuranceType;
	private double monthlyCost;
	
	// Constructors
	public Insurance(String insuranceType, double monthlyCost) {
		this.insuranceType = insuranceType;
		this.monthlyCost = monthlyCost;
	}
	
	public Insurance(String insuranceType) {
		this.insuranceType = insuranceType;
		this.monthlyCost = 0;
	}
	
	// Setters
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	public void setMonthlyCost(double monthlyCost) {
		this.monthlyCost = monthlyCost;
	}
	
	// Getters
	public String getInsuranceType() {
		return insuranceType;
	}
	
	public double getMonthlyCost() {
		return monthlyCost;
	}
	
	// Abstract methods
	public abstract void setInsuranceCost(double insuranceCost);
	public abstract void displayInfo();
}
