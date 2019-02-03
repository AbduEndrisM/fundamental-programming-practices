package eleven.hashmap4;

import java.util.HashMap;

public class MyTable {
	
	
	public static void main(String[] args){
		
		HashMap<Character, String> table = new HashMap<>();
		

		table.put('a', "Andrew");
		table.put('b',"Billy");
		table.put('w',"Willie");
		table.put('s',"Sobah");
		table.put('e',"Ethio");
		
		for(char c:table.keySet()) {
			System.out.println(c+"-> "+table.get(c));	
		}
		
		
		
		
	}

}