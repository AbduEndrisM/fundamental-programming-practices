package one.four;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Employee[] emp = new Employee[3];

		emp[0] = new Employee("AbduA", 2010, 10, 10);
		emp[1] = new Employee("AbduB", 2012, 11, 11);
		emp[2] = new Employee("AbduC", 2014, 12, 12);

		emp[0].createNewChecking(10500);
		emp[0].createNewSavings(1000);
		emp[0].createNewRetirement(9300);

		emp[1].createNewChecking(34000);
		emp[1].createNewSavings(27000);

		emp[2].createNewChecking(10038);
		emp[2].createNewSavings(12600);
		emp[2].createNewRetirement(9000);

		// for phase I – console output
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.println("Make a selection (A/B/C)");
		
		char choice = sc.nextLine().charAt(0);
		switch (choice) {
		case 'A':
			for (Employee e : emp) {
				System.out.println("\n\nName: " + e.getName());
				System.out.println(e.getFormatedAcctInfo());
				 

			}
			break;
		case 'B':
		
			for(Employee e: emp)
			System.out.println(e.getName());
			System.out.println("Make a selection (0/1/2");
			int select = sc.nextInt();
					
			
			break;
		case 'C':
			break;
			
		}
		 

	}
}
