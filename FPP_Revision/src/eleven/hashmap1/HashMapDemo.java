package eleven.hashmap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> countries = new HashMap<String, String>();

//	 	HashMap<String, Integer> map = new HashMap<String,Integer>();

		countries.put("India", "IN");
		countries.put("USA", "US");
		countries.put("Russia", "RS");
		countries.put("Japan", "JP");
//		countries.remove("USA");
		countries.put("China", "CH");
		countries.put("Russia", "RU");
		countries.put("Eritrea", "ET");
		countries.put("Canada", "CA");
		countries.put("Ethiopia", "ET");

//        System.out.println(countries.size());

		for (String key : countries.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();

		/*
		 *  countries.values().forEach((value)->System.out.print(value+"  "));
		 * System.out.println();
		 */

		/*
		 * countries.forEach((key, value) -> System.out.print(key + " = " + value +
		 * "  ")); System.out.println();
		 */
		/*
		 * countries.keySet().forEach((key) -> System.out.print(key + " "));
		 * System.out.println();
		 */
		
		/*for(String key:countries.keySet()) {
			System.out.println(countries.get(key));
		}*/
		/*
		 * for (String value : countries.values()) System.out.print(value + "  ");
		 */
		List<String> string = new ArrayList<>();
		string.addAll(countries.values());
		System.out.println(string);
		System.out.println(countries.keySet().size());

		for (int i = 0; i < countries.keySet().size(); i++) {
			System.out.print(countries.values().toArray()[i] + " ");
		}

	}
}
