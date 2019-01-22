package five.one.case3;

import java.time.LocalDate;


public class Person {

	private String name;
	private LocalDate dateOfBirth;
	Person(String name, int year, int month, int dayOfMonth) {
		this.name = name;
		dateOfBirth = LocalDate.of(year, month, dayOfMonth);
	}
	public String getName() {
		return name;
	}
	
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public boolean equals(Object obj) {
	    if (obj == this) {
	      return true;
	    }
	    if (this.getClass()!=(obj.getClass())) {
	      return false;
	    }
	    
	    PersonWithJob cc = (PersonWithJob)obj;
	    boolean isEqual = (this.name.equals(cc.getPerson().name))&&(this.dateOfBirth.equals(cc.getPerson().dateOfBirth));
	    return isEqual;
	  }
	
		
	public static void main(String[] args) {

		Person p = new Person("Joe", 2018, 10, 21);
		PersonWithJob p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		PersonWithJob p2 = new PersonWithJob("Joe", 2018, 10, 21, 800);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));
	}

}
