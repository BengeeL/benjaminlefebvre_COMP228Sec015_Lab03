package benjaminlefebvre_sec015_ex02;

public class FullTimeGameTester extends GameTester {
	
	// Variables
	private double salary;
	
	// Constructor
	public FullTimeGameTester(String name) {
		super(name, true);
		salary = 3000.00;
	}
	
	// Setters 
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}

	// Abstract methods override.
	@Override
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nThey make " + salary + "$ monthly\n";
	}
}
