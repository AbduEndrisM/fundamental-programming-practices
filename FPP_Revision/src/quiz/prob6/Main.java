package quiz.prob6;

import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	Address address;
	private List<Address> listOfAddresses;
	private StringBuilder output = new StringBuilder();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	}
	private void loadData(){
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));
		

	}
	
	public void printAsUpperCase() {

		String string="";
		for(Address a:listOfAddresses) {
			string+=formatFields(a.toUpper());
		}
	/*	listOfAddresses.forEach(e->{
			 formatFields(e.toUpper());
		});*/
		System.out.println(string);
//		for(String a:list) {
//			System.out.println(a);
////			System.out.println(a.getStreet());
////			System.out.print(a.getCity());
////			System.out.print(a.getState()+", "+a.getZip());
//			
	

			System.out.println();
			System.out.println();
		
		
		//implement
	}
	
	private String formatFields(List<String> list) {
		//implement
		String[]xxx=list.toArray(new String[0]);
		String x = String.format("%s\n%s\n%s, %s%s\n\n",xxx);
		return x;
	}
	
	
	

}
