package miscellaneous.six;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class RemoveDups {
	public static void main(String[] args) {

		String[] testData = { "horse", "dog", "cat", "horse", "dog" };

		for (String s : testData)
			System.out.print(s + ", ");

		System.out.println();

		System.out.println();

		// using hashmap
		testRemoveDups1(testData);

		// using loop
		testRemoveDups2(testData);

	}

	private static void testRemoveDups1(String[] testData) {

		HashMap<String, String> testData1 = new HashMap<>();
		for (int i = 0; i < testData.length; i++) {
			testData1.put(testData[i], null);
		}
		System.out.println(testData1.keySet());

	}

	private static void testRemoveDups2(String[] testData) {

		List<String> testData2 = new ArrayList<>();
		for (int i = 0; i < testData.length; i++) {

			boolean found = false;

			for (int j = 0; j < testData2.size(); j++) {
				if ((testData[i].equals(testData2.get(j))) == true) {
					found = true;
				}

			}
			if (found == false)
				testData2.add(testData[i]);

		}
		for (String s : testData2)
			System.out.print(s + ", ");

	}
}
