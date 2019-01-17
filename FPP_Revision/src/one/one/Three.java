package one.one;
 
 
import java.util.Arrays;
import java.util.HashMap; 
import java.util.Scanner;

//Remove Duplicate elements of an array using HashMap
public class Three {
public static void main(String[] args) {
	String[] testData = {"horse","dog","cat","horse", "dog"};
	String[] result = removeDuplicate(testData);
	/*for (String s:result) 
		System.out.print("" +s+" ");*/
	
	System.out.println(Arrays.toString(result));
	
	
	/*Scanner sc = new Scanner(System.in);
	System.out.print("Type your name: ");
	System.out.println("you wrote: " + sc.nextLine() );
	System.out.print("Type your age: ");
	System.out.println("your age: " + sc.nextInt());
	//sc.close(); //don’t forget to close 
*/}

private static String[] removeDuplicate(String[] data) {

	HashMap<String,String> listNoDuplicate = new HashMap<>();
	
	for(String s: data)
		listNoDuplicate.put(s, null);
	
    String[] s = listNoDuplicate.keySet().toArray(new String[listNoDuplicate.size()]);

	return  s;
	
}
}
