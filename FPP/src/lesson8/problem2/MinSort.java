package lesson8.problem2;

public class MinSort {
	Person[] arr;

	MinSort(Person[] arr) {
		this.arr = arr;
	}

	public void sort() {
		if (arr == null || arr.length <= 1)
			return;
		int len = arr.length;
		// int temp = 0;
		for (int i = 0; i < len; ++i) {
			int nextMinPos = minpos(i, len - 1);
			swap(i, nextMinPos);
		}

	}

	void swap(int i, int j) {
		Person temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	// find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top) {
		Person m = arr[bottom];
		int index = bottom;
		for (int i = bottom + 1; i < top; ++i) {
			if (arr[i].getLast().compareTo(m.getLast()) < 0) {
				m = arr[i];
				index = i;
			}
		}
		// return location of min, not the min itself
		return index;
	}

}