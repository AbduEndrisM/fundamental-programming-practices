package two.three;

import java.util.GregorianCalendar;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(double salary, String name, double hireDate, int numberOfPublications) {
		super(salary, name, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	// since we are passing this value through constructor no need to use setter

	/*
	 * public void setNumberOfPublications(int numberOfPublications) {
	 * this.numberOfPublications = numberOfPublications; }
	 * 
	 */

}
