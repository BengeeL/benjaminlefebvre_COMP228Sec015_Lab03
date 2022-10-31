package benjaminlefebvre_sec015_ex01;

//Modules
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceTest {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Variables
		List<Insurance> insuranceList = new ArrayList<Insurance>();
		
		// Add new insurance until user asked to stop.
		boolean isValid = true;
		do {
			
			String insuranceType = getInputInsuranceType();
			double monthlyCost = getInputMonthlyFee();
			
			switch (insuranceType) {
			case "life":
				Life newLifeInsurance = new Life(monthlyCost);
				newLifeInsurance.displayInfo();
				insuranceList.add(newLifeInsurance);
				break;
				
			case "health":
				Health newHealthInsurance = new Health(monthlyCost);
				newHealthInsurance.displayInfo();
				insuranceList.add(newHealthInsurance);
				break;
			}
			
			System.out.println("\nWould you like to add a new insurance? 'y' or 'n'");
			
			if ((scan.next()).equals("n")) {
				isValid = false;
			}
			
			System.out.println();
			
		} while(isValid);
		
		
		// Display the insurance in the array sending setInsuranceCost messages with display information.
		for (Insurance currentInsurance : insuranceList) {
			currentInsurance.displayInfo();
			System.out.printf("Set Insurance Cost $%.2f%n", currentInsurance.getMonthlyCost());
			currentInsurance.setInsuranceCost(currentInsurance.getMonthlyCost());
		}
		
		scan.close();
	}
	
	public static String getInputInsuranceType() {
		
		String insuranceType;
		
		// Insurance Type Validation loop until valid
		boolean isInsuranceTypeValid = false;
		do {
			
			System.out.println("Enter the insurance type: 1) Life  -  2) Health");
			insuranceType = scan.nextLine().toLowerCase();
			
			if (insuranceType.equals("1") || insuranceType.equals("life")) {
				
				insuranceType = "life";
				isInsuranceTypeValid = true;
				
			} else if (insuranceType.equals("2") || insuranceType.equals("health")) {
				
				insuranceType = "health";
				isInsuranceTypeValid = true;
				
			} else {
				
				System.out.println("Use the number (1 or 2) or the type (life or health)\n");
			
			}
			
		} while (!isInsuranceTypeValid);
		
		
		return insuranceType;
	}
	
	public static double getInputMonthlyFee() {
		
		
		double monthlyCost = 0;
		System.out.print("Enter the insurance monthly fee: ");
		
		boolean isValid = false;
		while (!isValid) {
			if (scan.hasNextDouble()) {
				monthlyCost = scan.nextDouble();
				isValid = true;
			} else {
				System.out.println("\nFormat should be x,xxx.xx. Please try again.");
				scan.next();
			}
		}
		
		
		return monthlyCost;
	}
}
