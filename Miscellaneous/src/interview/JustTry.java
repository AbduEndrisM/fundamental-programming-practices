package interview;

public class JustTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	int permut = 1;
		permut *= fact(4);
		System.out.println(permut);
	}
	 

	private static int   fact(int count) {
		if (count<=1)
			return count;
		   return count * (count-1)  ;
		// TODO Auto-generated method stub
		
	}	 
	 

}
