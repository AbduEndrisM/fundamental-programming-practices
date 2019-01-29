package six.recursion;

/**
 * 
 *
 * F0 = 0, F1 = 1, F2 = 1, F3 = 2, F4 = 3, F5 = 5,…, 0 1 1 2 3 5 8 13 F0 F1 F2
 * F3 F4 F5 F6 F7
 */
public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println("With Recursion: " + f.fib(18));
		System.out.println("With Loop: " + f.fibo(18));

	}

	

	private int fib(int n) {
		// implement

		if (n == 0 || n == 1)
			return n;
		else {
			return fib(n - 2) + fib(n - 1);
		}

	}
	
	private int fibo(int n) {

		int one = 0;
		int two = 1;
		int fib = 1;
		if (n == 0 || n == 1)
			return n;
		else {

			for (int i = 2; i <= n; i++) {
				fib = one + two;
				one = two;
				two = fib;
			}
		}
		return fib;
	}
}
