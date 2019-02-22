package interview;

/*Quora is looking for bug-free programmers. The two questions are about string permutation
and "football problem". 
Entry level problems but I didn't fix all the errors during the given time.  
*
*/

// started 1:40 - 3:05 done  1:30 hour too bad!!!
public class SiftwareeEngQoura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String football = "aaa";
//		ybghjhbuytb
		char[] a = football.toCharArray();
		int factOfLength = fact(a.length);
		int permut=1;
		
		for(int i=0; i<a.length-1; i++) {
			int count=1;
			for (int j=i+1; j<a.length;j++) {
				if (a[i]==a[j]) { 
					count++;
					a[j]=' ';
				}
		}
		permut *= fact(count);
		System.out.println(permut);
	}
		//System.out.println(factOfLength/permut);
	}

	private static int   fact(int count) {
		if (count<=1)
			return count;
		   return count * (count-1)  ;
		// TODO Auto-generated method stub
		
	}

}
