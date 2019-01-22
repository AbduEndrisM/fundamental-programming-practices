package five.one.case1;

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
	    if (!(obj instanceof Person)) {
	      return false;
	    }
	    
	    Person cc = (Person)obj;
	    boolean isEqual = (this.name.equals(cc.name))&&(this.dateOfBirth.equals(cc.dateOfBirth));
	    return isEqual;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Joe", 2018, 10, 21);
		Person p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		Person p2 = new PersonWithJob("Joe", 2018, 10, 21, 800);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));

	}

}
