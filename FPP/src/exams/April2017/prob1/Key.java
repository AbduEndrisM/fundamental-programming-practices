package exams.April2017.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	


	@Override
	public boolean equals(Object o) {
		
		if (o==null)
			return false;
		if (o.getClass()!=this.getClass())
			return false;
		Key k = (Key) o;
		return (k.getFirstName()==this.firstName && k.lastName==this.lastName);	
	}
	
	@Override
	public 	int hashCode() {
		return Objects.hash(firstName, lastName);
	}
}
