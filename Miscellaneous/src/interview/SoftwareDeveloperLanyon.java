package interview;

/*Interview Questions

FizzBuzz  */
/*Write a program that prints the numbers from 1 to 100 and 
for multiples of '3' print "Fizz" instead of the number and
for the multiples of '5' print "Buzz".
*///started 3:35  done  3: 41
public class SoftwareDeveloperLanyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)
				System.out.print("Flizz ");
			else if (i % 5 == 0)
				System.out.print("Buzz ");
			else
				System.out.print(i+" ");
		}
	}

}
