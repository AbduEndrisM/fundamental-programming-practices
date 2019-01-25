package four.comparable;
 
import java.util.ArrayList; 
import java.util.List;

public class SortoutWithLambda {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
 
		listDevs.forEach((developer) -> System.out.println(developer));

		// sort by age
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
		System.out.println("After Sort by Age");
		// lambda to print the List
		listDevs.forEach((developer) -> System.out.println(developer));

		
		
		// sort by name
		listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));
		System.out.println("After Sort by Name");
		listDevs.forEach((developer) -> System.out.println(developer));
		 
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", 70000, 33));
		result.add(new Developer("alvin", 80000, 20));
		result.add(new Developer("jason", 100000, 10));
		result.add(new Developer("iris", 170000, 55));

		return result;

	}

}

class Developer {
	private String name;
	private int salary;
	private int age;

	public Developer(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}