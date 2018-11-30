package lesson2;

public class ArrayExample {
	public static void main(String args[]) {
		// Demo for for each and split function
		int[] arr = { 4, 5, 12, 25 };

		for (int x : arr) {
			System.out.println(x);
		}
		
		
//The string split() method breaks a given string around matches of the given regular expression.
		
		String t = "Hello,strings can be fun.They have many uses.";
		
		String[] result = t.split(",|\\.| "); // split on commas, periods and blank spaces 
		for (String x1 : result) {
			System.out.println(x1);
		}

	}
}
