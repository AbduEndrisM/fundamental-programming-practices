package ten.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class StackEmployeeDemo {

	private String fName;
	private String lName;
	private double salary;

	public StackEmployeeDemo(String fName, String lName, double salary) {
		// TODO Auto-generated constructor stub
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}

	public static void main(String[] args) {

//		Stack <StackEmployeeDemo>s = new Stack<StackEmployeeDemo>();
//		

		Stack<StackEmployeeDemo> stack = new Stack<StackEmployeeDemo>();

		stack.push(new StackEmployeeDemo("AbduA", "Edris", 1000.0));
		stack.push(new StackEmployeeDemo("AbduB", "Edris", 2000.0));
		stack.push(new StackEmployeeDemo("AbduC", "Edris", 3000.0));
		stack.push(new StackEmployeeDemo("AbduA", "Edris", 3000.0));
		stack.push(new StackEmployeeDemo("AbduC", "Edris", 3000.0));
		stack.push(new StackEmployeeDemo("AbduD", "Edris", 3000.0));
		stack.push(new StackEmployeeDemo("Abduz", "Edris", 3000.0));
		stack.push(new StackEmployeeDemo("AbduC", "Edris", 3000.0));
 

		HashMap<String, Integer> hash = new HashMap<>();

		for (StackEmployeeDemo s : stack) {
			int count = 1;
			for (String st : hash.keySet()) {
				if (st.equals(s.fName)) 
					count = hash.get(st) + 1;
			 
			}
			hash.put(s.fName, count);
		}

		hash.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
	}

}
