package lesson2;
 
public class CommandLineArg {
	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; ++i) {  
			System.out.println("position " + i + ": " + args[i]);
} 
	}
         
}

