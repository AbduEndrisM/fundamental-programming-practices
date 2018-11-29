 

import java.util.Random;

/**
 *  This class keeps hold of an instance of Random and guarantees
 *  that the same instance will be used over and over (so the cost
 *  of re-seeding the random number generator is avoided).
 *  Each time the getRandomInt() method is called, the next integer
 *  from this Random instance is returned. 
 */
public class RandomNumbers {
    
	public static void main(String[] args){
		Random r = new Random();
		System.out.println(r.nextInt()+" "+r.nextInt()+" "+r.nextInt()+" "+r.nextInt());
		r = new Random();
		System.out.println(r.nextInt()+" "+r.nextInt()+" "+r.nextInt()+" "+r.nextInt());
		r = new Random();
		System.out.println(r.nextInt()+" "+r.nextInt()+" "+r.nextInt()+" "+r.nextInt());
		r = new Random();
		System.out.println(r.nextInt()+" "+r.nextInt()+" "+r.nextInt()+" "+r.nextInt());
		String s = "hello";
		char c = s.charAt(0);
		char d = s.charAt(1);
		System.out.println(c+" "+d+" "+(char)(c+d));
	}
        
        
}
