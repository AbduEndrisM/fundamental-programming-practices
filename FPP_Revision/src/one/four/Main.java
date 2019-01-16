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
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		
		if (answer.equalsIgnoreCase("y")) {
			
			for (Employee e : emp) {
				System.out.println("\n\nName: " + e.getName());
				System.out.println(e.getFormatedAcctInfo());

			}
		} else {
			System.out.println("Have a good day!");
		}

	}
}
