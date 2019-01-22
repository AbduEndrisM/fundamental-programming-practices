package five.one.case2;


public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, int year, int month, int dayOfMonth, double salary) {
		super(name, year, month, dayOfMonth);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
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
	    boolean isEqual = (this.getName().equals(cc.getName()))&&(this.getDateOfBirth().equals(cc.getDateOfBirth())&&(this.salary==(cc.salary)));
	    return isEqual;
	  }

	
}
