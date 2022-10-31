package benjaminlefebvre_sec015_ex03;

import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args) {
		
		Mortgage[] mortgagesArray = new Mortgage[3];

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the current prime interest rate.");
		double currentPrimeRate = scan.nextDouble();
		
		// Mortgage Entries
		for (int i = 0; i < mortgagesArray.length; i++) {
			
			System.out.println("\nPlease chose a mortgage type: Business (b) or Personal (p).");
			String mortgageType = scan.next().toLowerCase();
			
			if (mortgageType.equals("b") || mortgageType.equals("business")) {
				
				System.out.println("\nMortgage #" + i);
				System.out.println("\nPlease enter the mortgage reference number.");
				int mortgageNumber = scan.nextInt();
				
				System.out.println("Please enter the customer name.");
				String customerName = scan.next() + scan.nextLine();
				
				System.out.println("Please enter the mortgage balance. Maximum balance is $" + Mortgage.MAX_AMT);
				int balance = scan.nextInt();
				
				System.out.println("Please enter the mortgage term in full years (1, 3 or 5 years).");
				int mortgageTerm = scan.nextInt();
				
				BusinessMortgage businessMortgage = new BusinessMortgage(mortgageNumber, customerName, balance, currentPrimeRate, mortgageTerm);
				mortgagesArray[i] = businessMortgage;
				
			} else if (mortgageType.equals("p") || mortgageType.equals("personal")) { 
				
				System.out.println("\nMortgage #" + i);
				System.out.println("\nPlease enter the mortgage reference number.");
				int mortgageNumber = scan.nextInt();
				
				System.out.println("Please enter the customer name.");
				String customerName = scan.next() + scan.nextLine();
				
				System.out.println("Please enter the mortgage balance. Maximum balance is $" + Mortgage.MAX_AMT);
				double balance = scan.nextDouble();
				
				System.out.println("Please enter the mortgage term in full years (1, 3 or 5 years).");
				int mortgageTerm = scan.nextInt();
				
				PersonalMortgage personalMortgage = new PersonalMortgage(mortgageNumber, customerName, balance, currentPrimeRate, mortgageTerm);
				mortgagesArray[i] = personalMortgage;
				
			} else {
				
				System.out.println("\nWrong input. Please try again by typing business or personal.");
				i--;
				
			}
		}
		
		System.out.println(mortgagesArray.length + " mortgages saved.");
		System.out.println("\nThese are the details saved:");

		// Display each mortgage
		for (int i = 0; i < mortgagesArray.length; i++) {
			mortgagesArray[i].getMortgageInfo();
		}
		
		scan.close();
		
	}

}
