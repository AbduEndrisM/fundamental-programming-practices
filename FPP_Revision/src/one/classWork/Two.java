package one.classWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Abdu {
	private static int count = 0;

	Abdu() {
		count++;
	}

	public int getCount() {
		return count;
	}
}public class Two {
	public static void main(String[] args) {
		Abdu a1 = new Abdu();
		Abdu a2 = new Abdu();

		System.out.println(a1.getCount());
		System.out.println(a2.getCount());

	}
}

