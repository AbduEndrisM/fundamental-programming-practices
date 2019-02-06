package six.recursion;

public class ReverseString {

	public static void main(String[] args) {

		String string = "abdu";
		StringBuilder str=new StringBuilder("edwin");
		
		System.out.println(str.reverse());
		 
		String rev2 = reverseStringUsingLoop(string);
		 System.out.println(rev2);
		
		 String rev3 = reverseStringUsingRecursion(string);
		 System.out.println(rev3);
		
	
	}

	private static String reverseStringUsingLoop(String string) {
		String rev=""; 
		for(int i=string.length()-1; i>=0;i--)
		rev=rev+string.charAt(i);
//			 System.out.print(string.charAt(i));
		
		return rev;
	}

	private static String reverseStringUsingRecursion(String string) {
		
		if(string==null||string.length()==0) {
			return string;
		}
		int n= string.length()-1;
		
	
		
		return string.charAt(n)+reverseStringUsingRecursion(string.substring(0, n));
		
		/*if (string.length()==0)
			return string;
		
		int x =string.length()-1;
				
		
		return string.charAt(x) + reverseStringUsingRecursion(string.substring(0, x));*/
		
		
	}
	

}
