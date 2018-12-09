package lesson5.problem5;

public class Main {

	public static void main(String[] args) {

		Computer c1 = new Computer("ASUS", "intel", 4, 2.5);
		Computer c2 = new Computer("ASUS", "intel", 4, 2.5);
	
		System.out.println(c1.equals(c2));
	
		System.out.println(c1==c2);		
	}

}
