package exams.March2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		/*Implement*/
		
		List<Vehicle> v = new ArrayList<Vehicle>();

		for (Object o : vehicleArray)
			v.add((Vehicle) o);
		return v;
	}

	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		/* implement */
		int sum = 0;
		for (Vehicle v : vehicleList) {
			sum = sum + v.getMilesUsedToday();
		}
		return sum;
	}
}
