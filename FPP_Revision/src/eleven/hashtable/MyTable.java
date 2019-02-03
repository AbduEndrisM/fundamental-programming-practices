package eleven.hashtable;

public class MyTable {
	private Entry[] entries;

	MyTable() {
		entries = new Entry[26];
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
	 
		for (int i = 0; i < entries.length; i++) {
			if(entries[i].key==c)
			  return entries[i].value;
		}
		return null;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// implement
		Entry e = new Entry(c, s);

		entries[(int) c - 97] = e;

	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		String string = "";
		for (int i = 0; i < entries.length; i++) {
			
			if (entries[i] != null) {
				//Entry  e =new Entry(i, value);
				string = string + entries[i].toString()+"\n";
			}
				
		}
		return string;
	}

	private class Entry {
		char key;
		String value;

		Entry(char ch, String str) {
			// implement
			this.key = ch;
			this.value = str;

		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement
			return key + " -> " + value;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");
		t.add('a', "Abdu");
 		System.out.println(t);
//
		String s = t.get('b');
		System.out.println(s);

	}

}