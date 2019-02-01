package ten.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack();
		
		stack.push(5);
		stack.push(7);
		stack.push(1);
		 
		for(int i:stack)
			System.out.println(i);
 	} 

}
