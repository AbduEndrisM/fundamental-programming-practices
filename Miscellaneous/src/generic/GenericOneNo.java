package generic;

 
public class GenericOneNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  i=4;
		char c='A';
		int[] x= {1,2,3};
		
		print(i);
		print(c);
		print(x);
		System.out.println(); 
	
	}
	

	private static void print(char c) {
		System.out.println(c);
		
	}
	private static void print(int i) {
		System.out.println(i);
		
	}
	private static void print(int[] x) {
		for(int i:x)
			System.out.print(i+" ");
		
	}

}
