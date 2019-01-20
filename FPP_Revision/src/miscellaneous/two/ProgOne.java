package miscellaneous.two;

import java.util.Random;

public class ProgOne {

	public static void main(String[] args) {
		
		Random r = new Random();
		//random.nextInt(max - min + 1) + min
		int x=r.nextInt((9-1+1)+1);
		int y=r.nextInt((14-3+1)+3);
		
		System.out.printf(" %.2f", Math.pow(Math.PI, x));
		System.out.printf("\n %.2f", Math.pow(y, Math.PI));
	}

}
