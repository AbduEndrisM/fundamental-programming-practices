package lesson8.problem2;

class Search {
	Person[] anArray;

	// anArray is a sorted array
	Search(Person[] anArray) {
		this.anArray = anArray;
	}

	// search a sorted array
	boolean search(String lastName) {
		boolean b = recurse(0, anArray.length - 1, lastName);
		return b;
	}

	boolean recurse(int a, int b, String lastName) {
		int mid = (a + b) / 2;

		if (anArray[mid].getLast() == lastName)
			return true;

		/*
		 * int r=anArray[mid].getLast().compareTo(lastName);
		 * 
		 * if (r==0) return true;
		 */
		if (a > b)
			return false;
		if (lastName.compareTo(anArray[mid].getLast()) > 0)
			return recurse(mid + 1, b, lastName);
		// if (a<b)

		return recurse(a, mid - 1, lastName);
	}
}
