package four.lambda.comparator;

import java.util.Arrays;

public class StringLength implements Comparable<StringLength> {

	private String name;

	public StringLength(String name) {

		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int compareTo(StringLength o) {
		if (name.length() < o.name.length())
			return -1;
		else if (name.length() < o.name.length())
			return 1;
		else
			return 0;
	}

public static void main(String[] args) {
	StringLength[] s = {new StringLength("abdu"),
					new StringLength("edwined"),
					new StringLength("bubabbuba"),
					new StringLength("zb")};
	
	Arrays.sort(s);
	
	System.out.println(Arrays.toString(s));
	
}

}
