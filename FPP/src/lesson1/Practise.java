package lesson1;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practise rs = new Practise();

		String abdu = rs.myReverse1("Abdu");
		System.out.println(abdu);

		String edris = rs.myReverse2("Edris");
		System.out.println(edris);

		String x1 = "Abdu";
		String x2 = "a";
		System.out.println(rs.myStartWith(x1, x2));

		int[][] x3 = { { 2, 3, 4 }, { 4, 88, 90 } };
		rs.changeTestScore(x3);

		int[] x4 = { 4, 5, 6, 7 };
		int[] x5 = new int[x4.length - 1];
		x5 = rs.removeLastPosition(x4);
		for (int i = 0; i < x5.length; i++)
			System.out.print(x5[i] + " ");

		System.out.println();

		String[] x6 = { "Abdu", "Ali", "Aradom", "Sobah", "Abdu" };

		int x7 = rs.howManyOccurrenceOfAParticularString(x6, "Abdu");
		System.out.println("Number of  Abdu : " + x7);

		rs.NestedLoop();
		System.out.println("");

		int[][] x8 = { { 1, 2 }, { 4, 3 } };
		int[][] x9 = { { 1, 2 }, { 4, 7 } };

		System.out.println(rs.isEquvalent(x8, x9));

	}

	boolean isEquvalent(int[][] x, int[][] y) {
		boolean equal = true;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i][j] != y[i][j])
					equal = false;

			}
		}
		return equal;
	}

	void NestedLoop() {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(2000 + i * 500 + j * 10 + " ");
			}
			System.out.println();

		}
	}

	int howManyOccurrenceOfAParticularString(String[] x, String y) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++)
				if (x[i] == y)
					count++;

		}

		return count;

	}

	int[] removeLastPosition(int[] arr) {

		int x = arr.length;
		int xx = x - 1;
		int[] arr2 = new int[xx];
		for (int i = 0; i < xx; i++)
			arr2[i] = arr[i];
		return arr2;

	}

	void changeTestScore(int[][] x) {
		int a = x.length;
		int b = x[0].length;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (x[i][j] >= 85)
					x[i][j] = x[i][j] + 4;

				if (x[i][j] < 85)
					x[i][j] = x[i][j] + 7;

			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}

	}

	boolean myStartWith(String x, String y) {
		if (x.charAt(0) == y.charAt(0))
			return true;
		else
			return false;

	}

	String myReverse1(String string) {
		String a = "";
		for (int i = string.length() - 1; i >= 0; i--)
			a = a + string.charAt(i);

		return a;

	}

	String myReverse2(String string) {

		if (string == null || string.length() <= 1)
			return string;

		return string.substring(1) + string.charAt(0);

	}

}
