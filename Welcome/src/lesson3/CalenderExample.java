package lesson3;


 
import java.util.*; // for GregorianCalendar
import java.text.*; // for DateFormat Class

public class CalenderExample {
	public static void main(String[] args) {
		// Creates a GregorianCalendar object for the quizDay, outputs
		// information about the day, and modifies the day using class
		// methods
		// Creates the quiz day object to store the day of the quiz

		GregorianCalendar quizDay = new GregorianCalendar(2015, Calendar.NOVEMBER, 30);

		int month, day; // store date attributes
		// Get integer value for the characteristics
		day = quizDay.get(Calendar.DAY_OF_MONTH);
		System.out.println("Day: " + day);
		month = quizDay.get(Calendar.MONTH);
		System.out.println("Month: " + month);

		// Make the quiz 4 days earlier
		// Get the new date
		quizDay.add(Calendar.DAY_OF_MONTH, -2);
		day = quizDay.get(Calendar.DAY_OF_MONTH);
		System.out.println("Day of the quiz: " + day);
		month = quizDay.get(Calendar.MONTH)+1;
		System.out.println("Month of the quiz: " + month);
		System.out.println("Year of the quiz: " + quizDay.get(Calendar.YEAR));
		
	}

}
