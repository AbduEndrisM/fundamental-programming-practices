package quiz.prob7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		Queue<Character> s = new LinkedList<>();
		 
				String string = "acac";
				//s.add(string);
				//char[] c = string.toCharArray();

				for (int i = string.length()-1; i >=0   ; i--) {
					s.add(string.charAt(i));	
			}
				
				String string2="";
				 while(!s.isEmpty()) {
					string2=string2+ s.remove(); 
				}

				  
				 if (string.equals(string2))
						System.out.println("YES");
					else
						System.out.println("No");
				/*if (string.length()%2==0) {
				for (int i = c.length-1; i >= (c.length)/2; i--) {
					s2.add(c[i]);	
			}
				}
				else {
					for (int i = c.length-1; i > (c.length)/2; i--) {
						s2.add(c[i]);	
				}
					}
				 System.out.println(s);
				 System.out.println(s2);
				if (s.equals(s2))
					System.out.println("YES");
				else
					System.out.println("No");
			 */
	}

}
