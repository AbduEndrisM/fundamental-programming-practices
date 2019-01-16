package three.classwork;

class Manager extends Employee {

	double bonus;
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}

	
	
	@Override
	public double getSalary() {
	double sal = super.getSalary()+bonus;
		return sal;

	}
	public void setBonus(double b) {
		bonus=b;
		 

	}

}
