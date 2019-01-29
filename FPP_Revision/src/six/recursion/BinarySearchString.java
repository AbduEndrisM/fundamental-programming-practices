package six.recursion;


public class BinarySearchString {

	public static void main(String[] args) {

		String string = "abdu";


		 System.out.println("Is a in the Array?: " + BinarySearchString.binarySearch(string, 'a', 0, string.length()-1));
		System.out.println("Is z in the Array?: " + BinarySearchString.binarySearch(string, 'z', 0, string.length()-1));
		System.out.println("Is A in the Array?: " + BinarySearchString.binarySearch(string, 'A', 0, string.length()-1));

	}

	public static boolean binarySearch(String string, char key, int start, int end) {
	
		int m=(start+end)/2;
		
		if (start>end) {
			return false;
		}
		char mid= string.charAt(m);
		if (mid==key) {//(string[m].compareTo(key)==0)
			return true;}
		else if (mid<key) {
			
			return (binarySearch(string, key, m+1, end));
		} else {
			
			return (binarySearch(string, key, start, m-1));
		
		}
		
	}
		
	}


