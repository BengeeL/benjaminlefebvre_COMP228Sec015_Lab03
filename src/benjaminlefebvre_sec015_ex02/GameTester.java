package benjaminlefebvre_sec015_ex02;

public abstract class GameTester {
	
	// Variables
	private String name;
	private boolean isFullTime;
	
	// Constructor
	public GameTester(String name, boolean isFullTime) {
		this.name = name;
		this.isFullTime = isFullTime;
	}
	
	// Setters
	public void setName(String newName) {
		name = newName;
	}
	
	public void setStatus(boolean isNowFullTime) {
		isFullTime = isNowFullTime;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	public boolean getStatus() {
		return isFullTime;
	}
	
	public abstract double getSalary();

	@Override
	public String toString() {
		return name + " is a " + (isFullTime ? "Full-Time" : "Part-Time") + " employee.";
	}
}
