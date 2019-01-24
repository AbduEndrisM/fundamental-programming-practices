package four.sortsearch;

import java.util.Arrays;

public class SelectionSortForString {

	public static void main(String[] args) {

		String[] adjs = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };

//		Arrays.sort(adjs);

		SelectionSortForString.sort(adjs);
		System.out.println(Arrays.toString(adjs));

	}

	public static String[] sort(String[] adjs) {

		Arrays.sort(adjs);
		// implement

		return adjs;
	}

}
