package lesson11;

import java.util.Hashtable;
import java.util.Set;

public class HashT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable  <Integer, String> hTable = new Hashtable <Integer, String>();
		  hTable.put(5, "Abdu");
	      hTable.put(7, "Sobah");
	      hTable.put(8, "Abdu");
	      hTable.put(7, "Aradom");
	      
	      Set<Integer> keys = hTable.keySet();

	     //  Set keys = hTable.entrySet();
	        for(Integer key:keys){
	            System.out.println(key+" -> "+hTable.get(key));
	        }
	        System.out.println(hTable.containsKey(5));
	}

}
