package lesson3;

enum Currency {
	US, INDIA, UK
}

class sample1 {
	void display(Currency cy) {
		switch (cy) {
		case US:
			System.out.println("Dollar");
			break;
		case INDIA:
			System.out.println("Rupee");
			break;
		case UK:
			System.out.println("Pounds");
			break;
		default:
			System.out.println("Wrong Input");
			break;

		}

	}

}

public class EnumDemo {
	public static void main(String[] args) {
		sample1 s = new sample1();
		s.display(Currency.INDIA);
		s.display(Currency.US);
		String x = "UK";
		Currency input = Currency.valueOf(x); // Converting String Input into Enum Type
		s.display(input);
	}

}