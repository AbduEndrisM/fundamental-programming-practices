package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Admin {

	

	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {

		List<String> listOfPhoneNumbers = new ArrayList<>();

	
		for (LibraryMember l : members) {
			for (CheckoutRecordEntry c : l.getCheckoutRecord().getCheckoutEntryList()) {
				if (c.getLendingItem().equals(item)) {
					listOfPhoneNumbers.add(l.getPhone());
				}
			}

		}
		/*
		listOfPhoneNumbers.sort((x, y) ->
			 x-y;
		);*/
		
		 

		Collections.sort(listOfPhoneNumbers);

		return listOfPhoneNumbers;

	}
}
