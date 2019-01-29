package six.recursion;

public class MergeString {

	public static void main(String[] args) {

		String string1 = "abf";
		String string2 = "bdmz";

		String string = merge(string1, string2);
		System.out.println(string);

	}

	private static String merge(String string1, String string2) {

//		String x = string1.substring(1);
//		String y = string2.substring(1);

		String z = "";

		if (string1.length() ==0||string2.length() ==0) {
			if(string1.length()==0)
				return z+string2;
			else
				return z+string1;
		}else {
			if (string1.charAt(0) < string2.charAt(0)) {
				z = z + string1.charAt(0);
			 
				return z+ merge( string1.substring(1), string2);
			} else {
				z = z + string2.charAt(0);
				 
				return z + merge(string1, string2.substring(1));
			}
		}
			
		
		
	}

}
