package exams.Jan2017.prob1;

@SuppressWarnings("serial")
public class QueueException extends Exception {
	public QueueException() {
		super();
		System.out.println("Abdu");
	}
	public QueueException(String msg) {
		super(msg);
	}
	public QueueException(Throwable t) { 
		super(t);
	}
}
