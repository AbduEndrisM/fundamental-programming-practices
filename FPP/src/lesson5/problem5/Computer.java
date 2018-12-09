package lesson5.problem5;

import java.util.Objects;

public class Computer {

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
	public boolean equals(Object obj)
		{
		// Are they same?
		 if(this == obj)
			 return true;
		 // Is other object a null reference?
		 if(obj == null)
			 return false;
		 // do they belongs to the same class?
		  if(!(obj instanceof Computer))//if (this.getClass() != obj.getClass()) //
			 return false;
		 // get the reference of obj in a laptop variable type
		Computer comp = (Computer) obj;
		
		//Do they have same name and same color
		if(comp.manufacturer.equals(this.manufacturer) && comp.processor.equals(this.processor) && (comp.ramSize == this.ramSize)&& (comp.processorSpeed == this.processorSpeed))
			return true;
		else
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 5;
		// User defined formula 
		hash = 37 * hash + manufacturer.hashCode() * processor.hashCode() * ((Integer) ramSize).hashCode() * ((Double)processorSpeed).hashCode();
		return hash;
		
	//	return Objects.hash(manufacturer,processor, ramSize,processorSpeed )
	}
	
	@Override
	public String toString()
	{
	String info = "Manufacturer = " + this.manufacturer + " Ram size = " + this.ramSize + " Processoe = " + this.processor + " Speed = " + this.processorSpeed ; 
	return info;
	}
	
	 
	
}
