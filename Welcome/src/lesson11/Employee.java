package lesson11;

 
import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord=new HashMap();
	
	public void addEntry(String date, double salary) {
		salaryRecord.put(date,salary);
	}
	public void printPaymentAmount(String date) {
		Double salaryObject = (Double)salaryRecord.get(date);
		if(salaryObject == null){
			System.out.println(firstName+" "+lastName+" did not receive a paycheck on "+date);
			
		}
		else {
			System.out.println(firstName+" "+lastName+" was paid "+salaryObject.doubleValue()+" on "+date);
		}
		
	}
	public void printAveragePaycheck() {
		Iterator it = salaryRecord.keySet().iterator();
		double accum = 0.0;
		int count = 0;
		while(it.hasNext()){
			String nextDate = (String)it.next();
			Double sal = (Double)salaryRecord.get(nextDate);
			accum += sal.doubleValue();
			++count;
		}
		System.out.println("Average paycheck for "+firstName+" "+lastName+" was "+accum/count);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 0; i < 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
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
