package problem3;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,Integer> set1 = new TreeMap<>();
		Set<String> set2 = new TreeSet<>();
		set2.add("Bereket");
		set2.add("Adane");
		set2.add("Adam");
	//	System.out.println(set2.remove("Adane"));
	//	System.out.println(set2);
		
		set1.put(1,6);
		set1.put(2,9);
		set1.put(4,3);
		set1.put(4,1);
		set1.put(5,3);
		set1.replace(4, 10);
		set1.containsKey(6);
		set1.containsValue(9);
		System.out.println("TreeMap size is "+set1.size());
		
		System.out.println(set1);
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("z", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.remove("b");
		map.get("a");
		map.put("a", 10);
		List<Integer> intList = new ArrayList<>();
		Set<String> list3=new TreeSet<>();
		list3=map.keySet();
		Set<String> tr = new TreeSet<>();
		tr=map.keySet();
		for(String s : list3) {
			intList.add(map.get(s));
		}
		//System.out.println("intList: "+intList);
		System.out.println("this is the tree "+tr);
	}

}
