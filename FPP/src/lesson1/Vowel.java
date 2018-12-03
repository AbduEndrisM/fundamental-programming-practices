package lesson1;

public class Vowel {

	public static void main(String[] args) {
		
		String x="aaokkk";
		System.out.println(recursiveVowel(x));
		
	}
	
	static int recursiveVowel(String x) {
		
		 int c = 0;
		if (x.length()==0)
		return c;
		else {
		char z=x.charAt(0);
		if (z=='a'||z=='e'||z=='o'||z=='i'||z=='u') 
			c++;
		return c + recursiveVowel(x.substring(1));
		}
		
	}
}
