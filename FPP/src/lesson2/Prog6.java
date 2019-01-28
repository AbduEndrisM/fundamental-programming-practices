package lesson2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String[] inputArray = {"horse", "dog", "cat", "horse","dog", "cat"};
			//using the tradiotion array
			String[] tempArray = new String[inputArray.length];
			
			//using List
			List<String>lastArray = new ArrayList<>();
			int i = 0;
			//outputArray[0] = inputArray[0];
			boolean duplicateString = false;
			for (String inputItem : inputArray) {
				for (String outputItem : tempArray) {
					if (outputItem == inputItem) {
						duplicateString = true;
					}
			
				}
				
			if (!duplicateString) {
				tempArray[i] = inputItem;
				lastArray.add(inputItem);
				i++;
				}
			 }
			for(String s:lastArray)
			System.out.println(s);
				
			int nullItem = 0;
				for (String str : tempArray) {
					if (str == null) {
						nullItem ++;
					}
				}
				
			String[] outputArray = new String[inputArray.length - nullItem];
			//Using Array copy
			System.arraycopy(inputArray, 0, outputArray, 0, inputArray.length - nullItem);
			System.out.print(Arrays.toString(outputArray));
			System.out.println();
			
			for (int j = 0; j < outputArray.length; j++) {
			outputArray[j] = tempArray[j];
			}
			for (String string : outputArray) {
			System.out.println(string);
			
			
	}

}
}
