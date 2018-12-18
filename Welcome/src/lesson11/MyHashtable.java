package lesson11;
 
import java.util.Iterator;
import java.util.LinkedList;

public class MyHashtable {
	private int size;
	private static final int INITIAL_SIZE = 19;
	private int tableSize;
	// To avoid collision with same index, every index is implemented with Linked List
	private LinkedList[] table; 
	public MyHashtable(){
		this(INITIAL_SIZE);
	}
	public MyHashtable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
		size=0;
	}
	// First Try
	/*public void put(Object key, Object value){
		//disallow null keys
		if(key==null) return;
		//get the "big" integer corresponding to the object
		//assumes key is not null
		int hashcode = key.hashCode();
			
		//compress down to a table slot
		int hash = hash(hashcode);
			
		//put the value and the key into an Entry object
		//which will be placed in the table in the
		//slot (namely, hash)
		//allows a null value
		Entry e = new Entry(key,value);
			
		// now place it in the table
		if(table[hash] == null){
			table[hash] = new LinkedList();
		}
		table[hash].add(e); // add the entry in the table 
	}*/
 // Second Try
	public void put(Object key, Object value){
		//disallow null keys
		if(key==null) return;

		//get the "big" integer corresponding to the object
		//assumes key is not null
		int hashcode = key.hashCode();
			
		//compress down to a table slot
		int hash = hash(hashcode);
			
		//create the entry
		Entry e = new Entry(key,value);
		boolean keyAlreadyInUse = false;
		if(table[hash] != null) {
		  for(Object ob : table[hash]) {
			Entry ent = (Entry)ob;
			if (ent.key.equals(key)) {
				keyAlreadyInUse = true;
				ent.value = value; //update value for this Entry
			}
		   }
		}
		//we handled case keyAlreadyInUse==true in loop
		if(!keyAlreadyInUse) {		
			// now place it in the table
			if(table[hash] == null){
				table[hash] = new LinkedList();
			}
			table[hash].add(e);
			size++;
		}
	}
	public Object get(Object key){
		//null key not allowed
		if(key==null) return null;
		//get the "big" integer corresponding to the object
		int hashcode = key.hashCode();
			
		//compress down to a table slot
		int hash = hash(hashcode);
			
		//if slot given by hash not yet in use, return null
		if(table[hash] == null) return null;
		//now look for the desired Entry, each index is a linked list, 
		//so Iterator is used to retrieve the correct match
		Entry e = null; 
		for(Iterator it = table[hash].iterator(); it.hasNext();){
			e = (Entry)it.next();
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null;
			 
	}
	public String toString(){
		String n = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Entry next = null;
				for(Iterator it = table[i].iterator(); it.hasNext();){
					next = (Entry)it.next();
					if(next.value!=null)
					sb.append(next + n);
					else 
					sb.append(next.key + "->null" + n);
				}
				
			}
		}
		return sb.toString();
	}
	private int hash(int bigNum) {
		return bigNum % tableSize;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0) return true;
		else return false;
	}
	private class Entry{
		private Object key;
		private Object value;
		Entry(Object key, Object value){
			this.key = key;
			this.value = value;
		}
		public String toString(){
			return key.toString()+"->"+value.toString();
		}
			
	}
}