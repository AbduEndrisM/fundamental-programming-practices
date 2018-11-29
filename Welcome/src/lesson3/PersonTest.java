package lesson3;


public class PersonTest {

	public static void main(String[] args) {
		// How to create objects
		Person p1 = new Person(); // Default Constructor
		p1.setName("Renuka");
		p1.setGender("Female");
		//System.out.println(p1.getName() + ", " + p1.getGender());
		
		
		Person p2 = new Person("John","Male"); // Parameterized Constructor
	//	p2.display();
		
		
		
		// Creation of Array of objects - way 1
		Person[] persons = new Person[3];
		persons[0] = p1;
		persons[1] = p2;
		persons[2] = new Person("Mohan","Male");
		 Person p3 = new Person("Mohan","Male");
		
		// Creation of Array of objects - way 2
		Person[] persons1 = { p1, p2,p3};
		Contact c1 = new Contact("rmohanraj.mum.edu","641-453-6784");
		Contact c2 = new Contact("rmohanraj.gmail.com","641-453-7777");
		Contact c3 = new Contact("mohanraj.gmail.com","655-453-7777");
		persons1[0].setCont(c1);
		persons1[1].setCont(c2);
		persons1[2].setCont(c3);
		p2.setCont(c2);
		for(Person p : persons1){
			if (p.getGender().equals("Male"))
			p.display();
			
		}
		
	}

}
