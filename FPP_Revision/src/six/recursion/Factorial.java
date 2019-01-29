package six.recursion;

/**
 * 
 * n!=n×(n−1)×(n−2)×...×3×2×1
 *
 * n! = n x (n-1)! 0!=1
 */
public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("With Recursion: " + f.factorial(5));
		System.out.println("Without Recursion: " + f.factorial2(5));
	}



	private int factorial(int n) {
		// implement
		if (n < 0)
			return 0;
		if (n == 0 || n == 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}
	
	private int factorial2(int n) {
		int fact=1;
		if (n < 0)
			return 0;
		if (n == 0 || n == 1)
			return 1;
		else {
			for(int i=n; i>0;i--)
				fact = fact*i;
		}
		
		return fact;
	}

}
