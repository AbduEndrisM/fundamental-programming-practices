package nine.comparator1;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	//implement
 

	 @Override
	public int compare(Employee o1, Employee o2) {
		 
		return o1.getName().compareTo(o2.getName());
	} 
	
	/*    public int compare( (o1,  o2)-> {
		  o1.getName().compareTo(o2.getName());
	});*/
	
	
}
