package lesson2;

public class StringMethods {
	public static void main(String args[]) {
		
		System.out.println("Hello".charAt(1));
		System.out.println("አብዱ"); //My name
		 
		String expr = "\ud835\udd6b is the set of integers";  //
		System.out.println(expr);
		
		System.out.println("𝕫_𝕫".length());
		System.out.println("𝕫_𝕫".charAt(1));
		
		String name = "Abdu Endris";
		String nickname = name.substring(0, 3);
		System.out.println(nickname);
		String whole = name.substring(0, name.length());
		String empty = name.substring(0, 0);
		System.out.println(whole);
		System.out.println(empty);
		System.out.println(empty.length());

		
		//Position of a character /sub-string
		String name1 = "Robert";
		int posOfT = name1.indexOf('t');
		System.out.println(posOfT);
		int posOfSubstr = name1.indexOf("bert");
		System.out.println(posOfSubstr);

		//Concatenation 
		String first = "Abdu";
		String space = " ";
		String last = "MOhammed";
		String fullname = first + space + last;
		System.out.println(fullname);

		//start and end of a string 
		String nam = "Robert";
		boolean result = nam.startsWith("Rob");// true
		System.out.println(result);
		boolean result2 = nam.startsWith("R"); // true
		System.out.println(result2);
		boolean result3 = nam.endsWith("bert"); // false
		System.out.println(result3);

			//Ethiopian scripts
		String ethiopia= "\u12A2 \u1275 \u12EE \u12FD \u12EB";
		System.out.println(ethiopia);
	}

}
