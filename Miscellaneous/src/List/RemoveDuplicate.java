package List;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		ArrayList<Integer> x = new ArrayList<>();
		Integer[] a = { 3, 4, 4, 9, 5, 7, 4, 3 };
		x.add(2);
		x.add(4);
		x.add(5);
		x.add(2);

		ArrayList<Integer> y = new ArrayList<>();
		
		y.addAll(Arrays.asList(a));

		
		ArrayList<Integer> z = new ArrayList<>();

		for (int i : y) {
			if (!z.contains(i)) {
				z.add(i);
			}
		}

		System.out.println(z);

	}

}
