package miscellaneous.five;

public class ReverseString {

	public static void main(String[] args) {
		String x = "Hello";
		String a = "Abdu";

		for (int i = x.length() - 1; i >= 0; i--)
			System.out.print(x.substring(i, i + 1));

		StringBuilder y = new StringBuilder("Hello");
		System.out.println();
		System.out.println(y.reverse());

		StringBuffer z = new StringBuffer("Hello");

		System.out.println(z.reverse());

		for (int i = a.length() - 1; i >= 0; i--)
			System.out.print(a.charAt(i));

		System.out.println();
		// recursive

		String rev = reverse(a);
		System.out.println(rev);

	}

	private static String reverse(String z) {
		if (z.isEmpty())
			return z;
		else
			return reverse(z.substring(1)) + z.charAt(0);

	}
}
