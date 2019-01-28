package lesson0;

import java.util.Date;

public class Practise2 {

	public static void main(String[] args) {
		 
		// sample
		String s1= "abdu";
		String s2= "abdu";
		String s3= new String("abdu");
		String s4= new String("abdu");
		String s5= s4;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4==s5);
		
	 	Date d1 = new Date();
		Date d2 = new Date();

		System.out.println(d1.equals(d2));
		System.out.println(d2.after(d1));
		
	 

	}

}
