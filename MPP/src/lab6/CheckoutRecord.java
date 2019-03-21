package lab6;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

//  LiCheckoutRecordEntry checkOutRecordEntry;
	private List<CheckoutRecordEntry> list = new ArrayList<>();
	
	
	
	public List<CheckoutRecordEntry> getCheckoutEntryList() {
	
		return list;
		
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		list.add(entry);
	}
	
}
