package ten.stack2;

public class StackMyStringLinkedList implements MyStringStack {

	@Override
	public void push(String string) {
		// TODO Auto-generated method stub

	}

	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		StackMyStringLinkedList stack = new StackMyStringLinkedList();

		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");

		System.out.println("Popping…" + stack.pop());
		System.out.println("Peeking…." + stack.peek());
		System.out.println("Popping…" + stack.pop());
	}
}
