package eleven.hashmap2;

import java.util.HashMap;

public class Employee {
	private String firstName;
	private String lastName;
//	private HashMap salaryRecord;
	HashMap<String, Double> salaryRecord = new HashMap<>();

	public void addEntry(String date, double salary) {
		// implement
		salaryRecord.put(date, salary);
	}

	public void printPaymentAmount(String date) {
		// implement
		boolean paid = false;
		int index = -1;
		
		 for(String s:salaryRecord.keySet()) {
			if(s.equals(date)) {
			System.out.println(firstName +" "+ lastName + "  was paid " + salaryRecord.get(s)+ "on "
						+ s); //date
			paid =true;
			}
		} 
		if(paid==false) {
			System.out.println(firstName +" "+ lastName + "  Not paid " + "on "	+ date); //date
	
		}
		
		/*for (int i = 0; i < salaryRecord.size(); i++) {
			if (salaryRecord.keySet().toArray()[i].equals(date)) {
				paid = true;
				index = i;
				break;
			}
		}
		if (paid == true)
			System.out.println(firstName +" "+ lastName + "  was paid " + (double) salaryRecord.values().toArray()[index] + "on "
					+ salaryRecord.keySet().toArray()[index]); //date

		else
			System.out.println(firstName +" "+ lastName + "  did not receive a paycheck on "+date);
*/
	}

	public void printAveragePaycheck() {
		// implement
		double average;
		double sum = 0;
		for(String s: salaryRecord.keySet()) {
			sum =sum+ salaryRecord.get(s);
		}

		System.out.println(sum/salaryRecord.keySet().size());
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 0; i < 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
