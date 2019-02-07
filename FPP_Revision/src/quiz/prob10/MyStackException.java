package quiz.prob10;

@SuppressWarnings("serial")
public class MyStackException extends Exception {
	public MyStackException() {
		super();
	}
	public MyStackException(String msg) {
		super(msg);
	}
	public MyStackException(Throwable t) { 
		super(t);
	}
}
