package miscellaneous.ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	static private int size;
	static private int length=2;
	String[] name = new String[length];

	public StringList() {
		size = 0;
	}

	public void add(String s) {
		if (size== length ) {
			resize();
		}
		name[size] = s;
		size++;
	}

	public String get(int i) {
		return name[i];
	}

	public boolean find(String s) {
		
		boolean found=false;
		for (String s1:name) {
			if (s1.equals(s))
				found=true;
		}
		return found;
	}

	public boolean remove(String s) {
		boolean removed = false;
		for(String s2: name) {
			if (s2.equals(s))
				s2=null;
				removed = true;
		}
			
		return removed;

	}

	public String toString() {
		return Arrays.toString(name);

	}

	public int size() {
		return size;

	}

	private void resize() {
		System.out.println("Resizing...");
		length = length * 2;
		System.arraycopy(name, 0, size, 0, length);
		
	}
}
