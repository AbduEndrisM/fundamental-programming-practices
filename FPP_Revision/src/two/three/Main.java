package two.three;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
		department[0]  = new Professor(100, "Abdu A", 2015,3);
		department[1]  = new Professor(100, "Abdu A", 2015,3);
		department[2]  = new Professor(100, "Abdu A", 2015,3);

		department[3]  = new Secretary(200, "Abdu B", 2010,200);	
		department[4]  = new Secretary(200, "Abdu B", 2010,200);

		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to sum all salaries in dep");
		char x= sc.nextLine().charAt(0);
		
		
		if(x=='y'||x=='Y') {
			double sum=0.0;
			for(DeptEmployee d:department) {
				sum=sum+d.computeSalary();
			}
			System.out.println("Total sum: "+sum);	

		}
		else {
			System.out.println("See u soon");
		}
	}
}
