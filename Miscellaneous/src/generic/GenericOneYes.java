package generic;
 
public class GenericOneYes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer  i=4;
		Character c='A';
		Integer[] iArray= {1,2,3};
		Character[] cArray= {'A','B','D','U'};
		print(i);
		print(c);
		printArray(iArray);
		printArray(cArray);
		
		System.out.println(maximum(3,8,1));
	}
	private static <T extends Comparable<T>>  T maximum(T x, T y, T z) {
		T max=x;
		if(y.compareTo(x)>0)
			max=y;
		if (z.compareTo(max)>0)
			max=z;
		
		return max;
		
	}

	private static <T> void print(T c) {
		System.out.println(c);
		
	} 
	
	private static <T> void printArray(T[] x) {
		for(T i:x)
			System.out.print(i+" ");
		System.out.println();
	}

}
