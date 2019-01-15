package one;



public class Main {

	public static void main(String[] args) {
		 Employee e = new Employee("Abdu", 2010, 11, 12);
		 e.createNewChecking(300);
		 e.createNewSavings(300);
		 e.createNewRetirement(300);
		 System.out.println(e.toString());
		}

}
