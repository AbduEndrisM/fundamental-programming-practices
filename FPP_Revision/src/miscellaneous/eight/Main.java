package miscellaneous.eight;


//non sense program
public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Abdu E", 20000, 2010, 12, 30);
		Account a1= new Account(e1, "CHECKING",300);
		Account a2= new Account(e1, "SAVINGS",300);
		Account a3= new Account(e1, "RETIREMENT",300);
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}

}
