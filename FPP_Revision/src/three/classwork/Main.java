package three.classwork;

public class Main {

	public static void main(String[] args) {


		Employee[] emp = new Employee[3];

		emp[0]=  new Employee("Abdu A", 1000, 2010, 5, 5);
		emp[1]=  new Employee("Abdu B", 2000, 2010, 5, 5);

		Manager mgr=  new Manager("Abdu C", 3000, 2010, 5, 5);
		mgr.setBonus(500);
		
		emp[2]=mgr;
		
		
		
		for(Employee e:emp) {
			System.out.println(e.getName()+", "+e.getSalary());	
		}
		
		
	}

}
