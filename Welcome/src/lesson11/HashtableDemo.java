package lesson11;
 
import java.util.*;
public class HashtableDemo {
	// Demo code to use enumeration to access the elements	
	public static void main(String[] args) {
		Hashtable<Integer,String> hTable=new Hashtable<Integer,String>();

        //adding or set items in Hashtable by put method key and value pair
        hTable.put(1, "Java");
        hTable.put(5, "C++");
        hTable.put(3, "WAPi");
        hTable.put(4, "SE");
      //  hTable.put(3, "Abdu");
         System.out.println(hTable);
        // Get Hashtable Enumeration to get key and value
        Enumeration em=hTable.keys();
                                   
        while(em.hasMoreElements())
        {
            //nextElement is used to get key of Hashtable
            int key = (Integer)em.nextElement();
         
            //get is used to get value of key in Hashtable
            String value=(String)hTable.get(key);

            System.out.println("Key :"+key+"  value :"+value);
        }
       
	}

}
