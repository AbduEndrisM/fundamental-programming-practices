package quiz.prob7;

import java.util.Stack;

public class StackPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
				Stack s = new Stack();
				 
				String string = "abdudba";
				char[] c = string.toCharArray();

				for (int i = 0; i < c.length; i++) {
						s.push(c[i]);	
				}
				String x ="";
				while(!s.isEmpty()) {
					x=x+s.pop();			 
				}
				if (x.equals(string))
					System.out.println("YES");
				else
					System.out.println("No");
			 
	}

}
