package lesson5.problem6.prob1;

import lesson5.problem6.Computer;

//clone shallow

public class PersonShallow implements Cloneable {

	private Computer computer;
	private String name;

	public PersonShallow() {

	}


	public PersonShallow (String name, Computer computer) {
		this.computer=computer;
		this.name=name;
		
	}

	public String toString() {
		String info = "Name   " + this.name+"  "+ this.computer; 
		return info;

	}

	
	@Override
	public Object clone() throws CloneNotSupportedException  {

		PersonShallow clone = (PersonShallow) super.clone();

		return clone;

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		// Shallow copy of Cloning assign the objects instance references

		PersonShallow obj = new PersonShallow("Abdu", new Computer("Asus", "Intel", 4, 2.3));

		System.out.println("Before Cloning");
		System.out.println(obj);

		PersonShallow cloObj = (PersonShallow) obj.clone();
		System.out.println("After Cloning ");
		System.out.println(cloObj);
  
		
		cloObj.computer.setRamSize(5);
		System.out.println("After Modifing the RAM :");
		System.out.println(cloObj);
		System.out.println(obj);
		

	}

}
