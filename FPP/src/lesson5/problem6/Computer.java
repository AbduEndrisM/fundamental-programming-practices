package lesson5.problem6;
 
public class Computer implements Cloneable {

	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	
	public Computer(String manufacturer, String processor, 	int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed=processorSpeed;
	}
	
	public void setRamSize(int ramSize) {
		this.ramSize=ramSize;
		
	}
	public int getRam() {
		return ramSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public double computePower() {
	
		return ramSize*processorSpeed;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {

		Computer clone= (Computer) super.clone();

		return clone;

	}
	
  
	@Override
	public String toString()
	{
	String info = "Manufacturer = " + this.manufacturer + " Ram size = " + this.ramSize + " Processoe = " + this.processor + " Speed = " + this.processorSpeed ; 
	return info;
	}
	
	 
	
}
