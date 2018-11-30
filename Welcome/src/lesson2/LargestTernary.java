package lesson2;


 
import java.util.Scanner;

public class LargestTernary {
	public static void main(String[] args) {
int a, b, c, max ;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value for a: ");
		a = in.nextInt();
		
		System.out.print("Enter the Value for b: ");
		b = in.nextInt();
		
		System.out.print("Enter the Value for c: ");
		c = in.nextInt();
		

		
		
		max = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
		System.out.println("Largest Number is: " + max);
		
	}

}
