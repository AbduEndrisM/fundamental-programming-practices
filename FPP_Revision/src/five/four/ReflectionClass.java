package five.four;


/*The big difference with the traditional new is that newInstance allows to instantiate 
 * a class that you don't know until runtime, making your code more dynamic.
*/

  class Employee {
	public String name;
	private int salary;

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	

}

public class ReflectionClass {

	public static void main(String[] args) throws ReflectiveOperationException {
		String className= "five.four.Employee";
		Class empClass = Class.forName(className);	//Class<?> empClass = Class.forName(className);
		Employee emp =(Employee) empClass.getDeclaredConstructor().newInstance();
		emp.setName("Abdu");
		emp.setSalary(1000);
		System.out.println(emp);
	}

}
