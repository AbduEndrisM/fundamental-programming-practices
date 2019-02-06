package quiz.prob7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.xml.soap.SAAJResult;

public class RemoveDup {

	public static void main(String[] args) {

		String[] testData = { "horse", "dog", "cat", "horse", "dog" };
		String[] result = removeDups(testData);

		System.out.println(Arrays.toString(result));
	}

	private static String[] removeDups(String[] data) {

		// remove duplicate elements in an array using HashMap
		HashMap<String, String> hash = new HashMap<>();
		for (String s : data) {
			hash.put(s, null);
		}

		String[] s = hash.keySet().toArray(new String[0]);//new String[hash.keySet().size()]; // (String[]) hash.keySet().toArray() [0];
				//s=hash.keySet().toArray(new String[0]);
				return s;
/*		for (int i = 0; i < hash.keySet().size(); i++) {
			
			s[i] =  (String) hash.keySet().toArray()[i];
		}
		return s;
*/
	}

}
