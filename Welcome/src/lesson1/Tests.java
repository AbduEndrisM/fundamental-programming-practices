package lesson1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tests {
public static void main(String[] args) {
	
	LocalDateTime lc = LocalDateTime.now();
	System.out.println(lc);
	
	String x="Abdu";
	String a="Abdu";
	String b = new String ("Abdu");

	System.out.println(x==a);
	System.out.println(x==b);
	
	
	byte q=5;
	byte w=4;
	byte e =  q+w;
	StringBuilder y = new StringBuilder("Java");
	
	/*
	String xx= null;
	String yy=null;
	System.out.println(xx.equals(yy));
	
	*/
	
	/*
	Tests t = new Tests();
	
	
	void myMethod(int counter) {
		if (counter ==0)
			System.out.println();
		else
		{
			System.out.println(" "+counter);
		myMethod(counter--);
		
		}
	}*/
	
	
	
}
}
