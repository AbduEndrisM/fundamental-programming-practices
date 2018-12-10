package lesson8.shopping;

import java.util.Objects;

public class Shopping {
	private String iname;
	private double price;

	public Shopping(String iname, double price) {
		this.iname = iname;
		this.price = price;
	}

	
	public String getIname() {
		return iname;
	}


	public void setIname(String iname) {
		this.iname = iname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	@Override
	
	public int hashCode() {
		return Objects.hash(iname,price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if(!(obj instanceof Object))
		if (getClass() != obj.getClass())
			return false;
		
		Shopping other = (Shopping) obj;
		if (iname == null) {
			if (other.iname != null)
				return false;
		} else if (!iname.equals(other.iname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return iname + " " + price +"	";

	}
}