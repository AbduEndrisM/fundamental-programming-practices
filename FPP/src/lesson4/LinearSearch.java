package lesson4;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] i = { 10,20,15,12,65,50};
		Object[] s = {"java","c#","SE","UML","WAP"};
		System.out.println("Searching of 12 in the list : " + Search(i,12,0));
		System.out.println("Searching of 12 in the list : " + Search(i,22,0));
		System.out.println("Searching of SE in the list : " + Search(s,"ASD",0));
		System.out.println("Searching of SE in the list : " + Search(s,"SE",0));
	}
	 private static int Search(Object[] items,
	            Object target, int posFirst) {
	        if (posFirst == items.length) {
	            return -1;
	        } else if (target.equals(items[posFirst])) {
	            return posFirst;
	        } else {
	            return Search(items, target, posFirst + 1);
	        }
	    }
}
