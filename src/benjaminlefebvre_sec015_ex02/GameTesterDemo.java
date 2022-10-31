package benjaminlefebvre_sec015_ex02;

import java.util.Scanner;

public class GameTesterDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		FullTimeGameTester fullTimeTester1 = new FullTimeGameTester("Benjamin Lefebvre");
		PartTimeGameTester partTimeTester1 = new PartTimeGameTester("Ali Rasikh");

		System.out.println(fullTimeTester1.toString());
		System.out.println(partTimeTester1.toString());
		
		System.out.print("To add a new employee enter 'a'. To quit enter anything else: ");
		
		if (scan.next().toLowerCase().equals("a")) {
			System.out.println("\nChoose between full-time enter 'f' or part-time enter 'p': ");
			
			String employeeType = scan.next().toLowerCase();
			
			if (employeeType.equals("f")) {
				
				System.out.println("\nPlease enter the full name for the Full-Time Employee: ");
				FullTimeGameTester fullTimeTester2 = new FullTimeGameTester(scan.next() + scan.nextLine());
				System.out.println("\nNew employee added!");
				System.out.println(fullTimeTester2.toString());

			} else if (employeeType.equals("p")) {
				
				System.out.println("\nPlease enter the full name for the Part-Time Employee: ");
				PartTimeGameTester partTimeTester2 = new PartTimeGameTester(scan.next() + scan.nextLine());
				System.out.println("\nNew employee added!");
				System.out.println(partTimeTester2.toString());
				
				System.out.println("\nPlease entre the number of hours worked by " + partTimeTester2.getName());
				partTimeTester2.setHours(scan.nextFloat());
				System.out.println("The employee earns: " + partTimeTester2.getSalary() + "$");
				
			} else {
				
				System.out.print("Have a good day!");
				
			}
		} else {
			
			System.out.print("Have a good day!");
			
		}
		
		scan.close();
	}

}
