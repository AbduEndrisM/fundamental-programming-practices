package interview;

import java.util.ArrayList;
import java.util.List;

/*Quora is looking for bug-free programmers. The two questions are about string permutation
and "football problem". 
Entry level problems but I didn't fix all the errors during the given time.  
*
*/

// started 1:40 -  not done
public class SiftwareeEngQoura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String football = "aaabcb";
//		ybghjhbuytb
		char[] a = football.toCharArray();
		int factOfLength = fact(a.length);
		int permut=1;
		List<Character> x  =new ArrayList<>(); 
		for(int i=0; i<a.length; i++) {
			if (x.contains(a[i])) {
				break;
			}
			int count=1;
			for (int j=i+1; j<a.length;j++) {
				if (a[i]==a[j]) { 
					count++;
				 x.add(a[i]);
				}
		}
			System.out.println(x);
		permut *= fact(count);
//		System.out.println(permut);
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
