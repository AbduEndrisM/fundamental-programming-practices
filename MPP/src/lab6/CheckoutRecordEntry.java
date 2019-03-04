package lab6;

import java.time.LocalDate;

public class CheckoutRecordEntry {

	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	LendingItem lItem = new LendingItem();

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getlItem() {
		return lItem;
	}
	public ItemType getLendingItem() {
		return null;
		
	}

	public CheckoutRecordEntry( LendingItem lItem, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lItem = lItem;
	}
	
	
	
	
	
}
