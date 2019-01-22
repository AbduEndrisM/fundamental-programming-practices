package five.one.case3;

public class PersonWithJob {
	public final Person p;
	private double salary;
	PersonWithJob(String name, int year, int month, int dayOfMonth, double salary) {
		//super(name, year, month, dayOfMonth);
		this.salary = salary;
		p =new Person(name, year, month, dayOfMonth);

	}
	public Person getPerson() {
		return p;
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
	    boolean isEqual = (this.getPerson().getName().equals(cc.getPerson().getName())&&(this.getPerson().getName().equals(cc.getPerson().getName()))&&(this.salary==cc.salary));
	    return isEqual;
	  }
	
}
