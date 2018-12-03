package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

//Write a Junit Test case to test any of the above two problems.
public class Prob5{

	@Test
	public void palindromeTest() {

		//Problem 4 - Palindrome
		Prob4 pal = new Prob4();
		boolean result = pal.isPalindrome("java");
		assertEquals (false,result);
		
		boolean result2 = pal.isPalindrome("javaj");
		assertEquals (true,result2);

		//Problem 2- thes smallest character
		Prob2 minChar = new Prob2();
		int result3 = minChar.minChar("java");
		assertEquals ('a',result3);
		
		
	}

}
