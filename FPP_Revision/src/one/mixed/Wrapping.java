package one.mixed;


//Practicing wrapper class and 
//implicit and explicit conversion 

public class Wrapping {
	public static void main(String[] args) {
		 
		
		int x =4;
		Integer y= x;
		double d1= 3.5;
		int d2 = (int) d1;

		String xx= Integer.toString(x);
		
		String s1 = "10";
		String q1 = "5.5";
		int s11= Integer.parseInt(s1);
		int s12 = Integer.valueOf(s1);
		
		double q11=Double.valueOf(q1);
		double q12=Double.parseDouble(q1);
		
		Integer s21= Integer.parseInt(s1);
		Integer s22 = Integer.valueOf(s1);
		
		int s31 = s21;
		int s32 = s22;
		
		System.out.println(q11);
		System.out.println(q12);
	}

}
