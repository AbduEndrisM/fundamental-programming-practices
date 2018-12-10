package lesson7.problem2;

public class myTable {
	private Entry[] en = new Entry[26];

	public String get(char c) {
		int index = (int) c - 97;
		return en[index].str;
	}

	public void add(char c, String s) {
		int index = (int) c - 97;
// str[index] = s;
		en[index] = new Entry(c, s);
	}

	@Override
	public String toString() {
		int i = 0;
		String str1 = "";
		while (en[i] != null) {
			str1 = str1 + en[i].toString() + '\n';
			i++;
		}
		return str1;
	}

	public class Entry {
		char ch;
		String str;

		Entry(char c, String s) {
			ch = c;
			str = s;
		}

		@Override
		public String toString() {
			return "[" + ch + "->" + str + "]";
		}
	}

	public static void main(String[] arg) {
		myTable t = new myTable();
		t.add('a', "Abdu");
		t.add('b', "Edris");
		t.add('c', "Aradom");
		System.out.println(t.get('a') + " " + t.get('b') + " " + t.get('c'));
		System.out.println(t);
	}
}