package lesson5.problem6.prob2;


import lesson5.problem6.Computer;

//clone deep

public class PersonDeep implements Cloneable {

	private Computer computer;
	private String name;

	public PersonDeep() {

	}


	public PersonDeep (String name, Computer computer) {
		this.computer=computer;
		this.name=name;
		
	}

	public String toString() {
		String info = "Name   " + this.name+"  "+ this.computer; 
		return info;

	}

	
	@Override
	public Object clone() throws CloneNotSupportedException {

		PersonDeep clone = (PersonDeep) super.clone();
		clone.computer= (Computer) this.computer.clone();

		return clone;

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		// Shallow copy of Cloning assign the objects instance references

		PersonDeep obj = new PersonDeep("Abdu", new Computer("Asus", "Intel", 4, 2.3));

		System.out.println("Before Cloning");
		System.out.println(obj);

		PersonDeep cloObj = (PersonDeep) obj.clone();
		System.out.println("After Cloning");
		System.out.println(cloObj);

		
		cloObj.computer.setRamSize(5);
		System.out.println("After Modifing the RAM :");
		System.out.println(cloObj);
		System.out.println(obj);

	}
}
