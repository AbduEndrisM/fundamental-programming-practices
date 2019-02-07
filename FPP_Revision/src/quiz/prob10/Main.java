package quiz.prob10;

public class Main {
	// You can test your own code with this main method
	public static void main(String[] args) {
		MyIntStack s = new MyIntStack();
		try {
			s.push(1);
			s.push(2);
			
//			s.push(3);
//			s.push(4);
//
//			System.out.println(s.isEmpty());
//
//			System.out.println(s.top);
			System.out.println("popping: " + s.pop());
			System.out.println(s.peek());
			System.out.println("popping: " + s.pop());
//			System.out.println(s.peek());
			for (int i = 0; i < 100; ++i) {
				System.out.print("pushing: " + i + " ");
				s.push(i);

			}
			for (int i = 0; i < 101; ++i) {
				s.pop();	
			}

		} catch (Throwable e) {
			System.out.println("\n" + e.getClass().getSimpleName() + "\nmessage: " + e.getMessage());
		}
	}

}
