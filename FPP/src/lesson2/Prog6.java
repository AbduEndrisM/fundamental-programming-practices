package lesson2;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String[] inputArray = {"horse", "dog", "cat", "horse","dog", "cat"};
			String[] tempArray = new String[inputArray.length];
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
				i++;
				}
			 }
				
			int nullItem = 0;
				for (String str : tempArray) {
					if (str == null) {
						nullItem ++;
					}
				}
				
			String[] outputArray = new String[inputArray.length - nullItem];
			for (int j = 0; j < outputArray.length; j++) {
			outputArray[j] = tempArray[j];
			}
			for (String string : outputArray) {
			System.out.println(string);
			
			
	}

}
}
