package lesson2;
 
public class ArraySplit {

	
	public static void main(String[] args) {
		//String s = "hello,how,are,you,today";
		String s = "hello how,are,you,today";
		String[] parsedVals =s.split(",| ");
		//String[] parsedVals =s.split(",");
		for(String x: parsedVals) {
			System.out.println(x);
						

	}
	}
}
