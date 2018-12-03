package lesson3;

public class StaticExample {
	
	// int count = 0;
	static int count = 0;

	StaticExample() {
		count++;
	}

	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		// Demo code for static member
		StaticExample instance = null; 
		for (int i = 0; i < 10; ++i) {
			instance = new StaticExample();
		}
		System.out.println("Number of instances so far =" + instance.getCount());
		System.out.println(instance.count); //StaticExample.count
	}

}
