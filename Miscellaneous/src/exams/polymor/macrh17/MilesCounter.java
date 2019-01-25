package exams.polymor.macrh17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle>convertArray(Vehicle[] vehicleArray) {
		/* implement */
		List<Vehicle> veh = new ArrayList<>();

		for (Vehicle v:vehicleArray)
		 	veh.add(v);
	 
		return veh;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		/*implement */
		int sum = 0;
		for (Vehicle v:vehicleList)
			sum=sum+v.getMilesUsedToday();
		return sum;
	}
}
