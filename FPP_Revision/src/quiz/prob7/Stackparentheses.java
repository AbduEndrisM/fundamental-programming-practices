package quiz.prob7;

import java.util.Stack;

public class Stackparentheses {

	public static void main(String[] args) {

		Stack<Character> s = new Stack<Character>();
		Stack<Character> s2 = new Stack<Character>();
		String string = "(3-1+(8-6))";
		char[] c = string.toCharArray();
//		System.out.println(check(c));
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(') {
				s.push(c[i]);
			}
			if (c[i] == ')') {
				s2.push(c[i]);
			}
		}

		if ((s.size() == s2.size()))
			System.out.println("true");
		else
			System.out.println("false");

		// --------------Method II------------------//
		char[] c2 = { '{', '(', ')', '}', '[', ']' };

		System.out.println(check(c2));
	}

	private static boolean check(char[] c2) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < c2.length; i++) {
			if (c2[i] == '(' || c2[i] == '{' || c2[i] == '[') {

				stack.push(c2[i]);
			} else if (c2[i] == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}

			else if (c2[i] == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			} else if (c2[i] == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}

		}

		return (stack.isEmpty());
	}
}
