package lab6;

import java.time.LocalDate;

public class CheckoutRecordEntry {

	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	private LendingItem lItem ;

	private ItemType lendingItemType;
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lItem;
	}
	public ItemType getLendingItemType() {
		return lendingItemType;
		
	}

	public CheckoutRecordEntry( LendingItem lItem, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lItem = lItem;
		this.lendingItemType=type;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lendingItemType == null) ? 0 : lendingItemType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckoutRecordEntry other = (CheckoutRecordEntry) obj;
		if (lendingItemType != other.lendingItemType)
			return false;
		return true;
	}
	*/
	
	
	
	
	
	
}
