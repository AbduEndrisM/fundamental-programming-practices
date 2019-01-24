package four.sortsearch; 

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchForString  {

	public static void main(String[] args) {

		String[] adjs = {"big", "small", "tall", "short", "round", "square",
                "enormous", "tiny","gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule"};

		Arrays.sort(adjs);
		//sorted array by using SelectionSortForString
	    SelectionSortForString mySort = new SelectionSortForString();

		String[] sorted = mySort.sort(adjs);

		System.out.println(Arrays.toString(sorted));

		 
		
		System.out.println("number? " + BinarySearchForString.binarySearch(sorted, "number"));
		System.out.println("tiny? " + BinarySearchForString.binarySearch(sorted, "tiny"));


	}

	public static boolean binarySearch(String[] temp, String key) {

        int l = 0, n = temp.length - 1; 
        while (l <= n) { 
            int m = l + (n - l) / 2;  
            if (temp[m].compareTo(key)==0)
                return true;  
            if (temp[m].compareTo(key)<0) 
                l = m + 1; 
   
            else
                n = m - 1; 
        } 
   
        return false; 
    }

 

 

}
