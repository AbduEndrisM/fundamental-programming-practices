package standardexams.classwork2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	
	public StringQueue getQueue() {
		return queue;
	}
	//implement

	public String nextMessage() {
		String msg="";
		try{
			
			 msg = queue.dequeue();
			
			
		}
		catch(EmptyQueueException e) {
		System.out.println(e.getMessage());
		}
		return msg;
	}
	

	public void addMessage(String msg){
		 
		  queue.enqueue(msg);
	}
	
	
	public abstract String getName();
	
	
	
	
}
