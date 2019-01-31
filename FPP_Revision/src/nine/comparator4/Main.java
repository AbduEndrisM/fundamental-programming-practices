package nine.comparator4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		SmartPhone nokia = new SmartPhone("Nokia", "Lumia 800", 600);
		SmartPhone samsung = new SmartPhone("Samsung", "Galaxy Ace", 800);
		SmartPhone apple = new SmartPhone("Apple", "IPhone4S", 1000);

		List<SmartPhone> smartPhones = new ArrayList<SmartPhone>();
		smartPhones.add(samsung);
		smartPhones.add(nokia);
		smartPhones.add(apple);

		System.out.println("------------SORT BY BRAND-------------");

		// Brand ASC - Lambda
		System.out.println("Brand DSC- Lambda");
		Collections.sort(smartPhones, (e1, e2) -> {
			return e2.getBrand().compareTo(e1.getBrand());
		});
		System.out.println(smartPhones);

		// Brand ASC - Anonymous
		System.out.println("Brand ASC - Anonymous");
		Collections.sort(smartPhones, new Comparator<SmartPhone>() {

			@Override
			public int compare(SmartPhone o1, SmartPhone o2) {
				return o1.getBrand().compareTo(o2.getBrand());
			}
		});
		System.out.println(smartPhones);

		/**
		 * Sort the elements of ArrayList in ascending order. Hint: Collections.sort();
		 */

		System.out.println("------------SORT BY PRICE-------------");

		/**
		 * Sort the elements of ArrayList by using PriceComparator. Hint:
		 * Collections.sort();
		 */

		System.out.println("Price ASC - other class");

		PriceComparator pc = new PriceComparator();
		Collections.sort(smartPhones, pc);
		System.out.println(smartPhones.toString());

		/**
		 * Sort the elements of ArrayList in descending order price comparator. Hint:
		 * Collections.sort();
		 */

		System.out.println("Price DSc - Anonymous");
		Collections.sort(smartPhones, new Comparator<SmartPhone>() {

			@Override
			public int compare(SmartPhone o1, SmartPhone o2) {
				// TODO Auto-generated method stub
				return o2.getPrice() - o1.getPrice();
			}

		});
		System.out.println(smartPhones.toString());

		/**
		 * Replace PriceComparator with using lambda function, we can provide sorting
		 * logic at runtime as well: Hint: Collections.sort();
		 */

		System.out.println("Price ASc - Lambda");
		smartPhones.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
		System.out.println(smartPhones);
		System.out.println("Price DSc - Lambda");
		smartPhones.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
		System.out.println(smartPhones);

		// System.out.println(smartPhones);

	}

}
