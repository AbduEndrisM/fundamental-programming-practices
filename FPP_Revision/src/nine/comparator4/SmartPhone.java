package nine.comparator4;
 
public class SmartPhone implements Comparable<SmartPhone>{

	private String brand;
	private String model;
	private int price;

	public SmartPhone(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	
	
	@Override
	public String toString() {
		return  brand + " " + model + " " + price + " ";
	}

	 

	@Override
	public int compareTo(SmartPhone obj) {
		 
		return obj.getPrice()-obj.getPrice();
	}

}
