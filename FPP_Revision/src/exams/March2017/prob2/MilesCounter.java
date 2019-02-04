package exams.March2017.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MilesCounter {
	public static List <Vehicle>/*<implement>*/ convertArray(Vehicle[] vehicleArray) {
		/* implement */
		List<Vehicle>list = new ArrayList<>();
		list= Arrays.asList(vehicleArray);
//		list.add((Vehicle)Arrays.asList(vehicleArray));
		return list;
	}
	
	
	public static int computeTotalMiles(List <Vehicle>/*<implement>*/ vehicleList) {
		/*implement */
		int sum=0;
		for(Vehicle v:vehicleList) {
			sum=sum+v.getMilesUsedToday();
		}
		return sum;
	}
}
