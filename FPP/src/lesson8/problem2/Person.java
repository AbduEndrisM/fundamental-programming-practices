package lesson8.problem2;

public class Person {
	private String lastName;
	private String firstName;
	private int age;

// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		lastName = last;
		firstName = first;
		age = a;
	}

// --------------------------------------------------------------
	public String getLast() // get last name
	{
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	}
} // end class Person