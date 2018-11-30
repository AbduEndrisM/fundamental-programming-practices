package lesson3.classDemo;


public class PersonTest {

	public static void main(String[] args) {
		// How to create objects
		Person p1 = new Person(); // Default Constructor
		p1.setName("Abdu");
		p1.setGender("Male");
		System.out.println(p1.getName() + ", " + p1.getGender());
		
		
		Person p2 = new Person("John","Male"); // Parameterized Constructor
		//p2.display();
		// System.out.println(p2.getName() + ", " + p2.getGender());
		
		
		
		// Creation of Array of objects - way 1
		Person[] persons = new Person[3];
		persons[0] = p1;
		persons[1] = p2;
		persons[2] = new Person("Semir","Female");
		 Person p3 = new Person("Ali","Male");
		
		// Creation of Array of objects - way 2
		Person[] persons1 = { p1, p2,p3};
		Contact c1 = new Contact("Ali@.mum.edu","123-456-7890");
		Contact c2 = new Contact("Sobah@gmail.com","123-453-7777");
		Contact c3 = new Contact("Abdu@gmail.com","123-453-7778");
		persons1[0].setCont(c1);
		persons1[1].setCont(c2);
		persons1[2].setCont(c3);
		p2.setCont(c2);
		for(Person p : persons1){
			if (p.getCont().getEmail().equals("Ali@.mum.edu"))
			p.display();
			
		}
		
	}

}
