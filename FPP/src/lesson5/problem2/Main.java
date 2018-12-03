package lesson5.problem2;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * LocalDate tenthFeb2014= LocalDate.of(2015, Month.FEBRUARY, 11) Professor p1 =
		 * new Professor("Abdu", 1000, tenthFeb2014, 4); Professor p2 = new
		 * Professor("Abdu", 1000, tenthFeb2014, 3); Professor p3 = new
		 * Professor("Abdu", 1000, tenthFeb2014, 44); Secretary s1 = new
		 * Secretary("Abdu", 1000, tenthFeb2014, 3); Secretary s2 = new
		 * Secretary("Abdu", 1000, tenthFeb2014, 3);
		 * 
		 * p1.setNumberOfPublications(10); p2.setNumberOfPublications(10);
		 * p3.setNumberOfPublications(10); s1.setOvertimeHours(2);
		 * s1.setOvertimeHours(3); department[0] = p1; department[1] = p2; department[2]
		 * = p3; department[3] = s1; department[4] = s2;
		 * 
		 */
		DeptEmployee[] department = { new Professor("Abdu", 1000, LocalDate.of(2015, Month.FEBRUARY, 11), 1),
				new Professor("Aradom", 2000, LocalDate.of(2015, Month.FEBRUARY, 11), 2),
				new Professor("Abdu2", 3000, LocalDate.of(2015, Month.OCTOBER, 12), 3),
				new Secretary("Aradom2", 4000, LocalDate.of(2015, Month.JANUARY, 13), 4),
				new Secretary("Abdu3", 5000, LocalDate.of(2015, Month.JANUARY, 13), 5) };

		System.out.println("Do u wanna sum all professors' salary");
		char answer = (char) System.in.read();

		if (answer == 'Y') {

			for (DeptEmployee emp : department) {
				
				System.out.println(emp.getClass().getSimpleName() + "  " + emp.computeSalary());

			}
			

		}

	}

}
