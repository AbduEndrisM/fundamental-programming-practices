package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*Quora is looking for bug-free programmers. The two questions are about string permutation
and "football problem". 
Entry level problems but I didn't fix all the errors during the given time.  
*
*/

// started 1:40  done 3:05 done  1:30 hour too bad!!!
public class SiftwareeEngQoura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String football = "ybghjhbuytb";
		HashMap<Character, Integer> list = new HashMap<>();

//		
		char[] a = football.toCharArray();

		int factOfLength = fact(a.length);
		int permut = 1;

		for (int i = 0; i < a.length; i++) {
			if (list.keySet().contains(a[i]))
				list.put(a[i], list.get(a[i]) + 1);
			else
				list.put(a[i], 1);

		}
		System.out.println(list);
		int length = fact(a.length);
		for (Character i : list.keySet()) {
			if (list.get(i) > 1) 
				permut *= fact(list.get(i));
		}
		
		System.out.println(factOfLength/permut);
	}
	

	private static int fact(int count) {
		if (count <= 1)
			return count;
		return count * fact(count - 1);
		// TODO Auto-generated method stub

	}

}
