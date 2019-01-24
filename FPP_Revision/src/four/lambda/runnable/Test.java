package four.lambda.runnable;
public class Test {

    public static void main(String[] args) {
		
		//print Hello World by using Runnable interface
        

        //r1.run();

    	Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Abdu");
			}
		};
    	
		r.run();
		
		
		Runnable r1 = ()->{
			System.out.println("Abdu Lambda");
		};
        r1.run();
		
    }

}
