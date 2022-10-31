package benjaminlefebvre_sec015_ex02;

public class PartTimeGameTester extends GameTester {
	
	// Variables 
	private double hourlySalary;
	private float hours;
	
	// Constructor
	public PartTimeGameTester(String name) {
		super(name, false);
		hourlySalary = 20.00;
		hours = 0;
	}
	
	// Setters 
	public void setSalary(double newSalary) {
		this.hourlySalary = newSalary;
	}
	
	public void setHours(float hours) {
		this.hours = hours;
	}
	
	// Abstract methods override.
	@Override
	public double getSalary() {
		return hourlySalary * hours;
	}

	@Override
	public String toString() {
		return super.toString() + "\nThey make " + hourlySalary + "$ per hours\n";
	}
}
