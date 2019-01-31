package nine.list2;


public class Main {

	public static void main(String[] args) {


		MyStringLinkedList list = new MyStringLinkedList();
//		list.add("Aob");
//		list.add("Zarry");
//		list.add("Lteve");
//		list.add("Dteve");
//		list.add("Buba");
//		list.add("Kteve");
//		list.add("Mteve");
//		System.out.println(list.size() + ": " + list);
//
//		list.insert("Jack",1);
//		System.out.println(list.size() + ": " + list);

		String[] string= {"big", "small", "tall", "short", "round", "square",
		                 "enormous", "tiny","gargantuan", "lilliputian",
		                 "numberless", "none", "vast", "miniscule"};
		
		for (String s:string)
		list.add(s);
		
		
		list.sort();
		System.out.println(list.size() + ": " + list);

		System.out.println(" \"number\" found in the list: "+list.search("number"));
		System.out.println(" \"tiny\"  found in the list: "+list.search("tiny"));
		

	}

}
