package lesson2;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x=1.27f;
		float y=3.881f;
		float z=9.6f;	
		
		System.out.println(x+y+z);	
		
			
		// Question 1 cast 
		int sum1=(int) (x+y+z);
		System.out.println(sum1);
		
		
		//Question 2 rounding
		int sum2= Math.round(x+y+z);
		System.out.println(sum2);
		
		
	}
 

}
