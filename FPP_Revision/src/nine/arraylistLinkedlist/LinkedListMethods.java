package nine.arraylistLinkedlist;

public interface LinkedListMethods {
	public void addLast(String element);
	public void addFirst(String element);
	public void add(int index, String element);
	public String get(int index);
	public boolean isEmpty();
	public String toString();
	public int size();

	
	public String findFirst();
	public String findLast();
	public boolean find(String s);
	public void removeFirst();
	public void removeLast();
	public boolean remove(int index);
	
	public String findMin();
	public String findMax();
	public void sort();


	public String recurMax();


}
