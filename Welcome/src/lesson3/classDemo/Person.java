package lesson3.classDemo;

public class Person { // Declare class - public / default modifier
	 
	 // Decalring data members
	 private String name;
	 private String gender;
	 private Contact cont;
	 
	 // Create a constructor
	 
	 public Contact getCont() {
		return cont;
	}
	public void setCont(Contact cont) {
		this.cont = cont;
	}
	Person(){ // default constructor
		 // Invoke another constructor using this keyword
			this("Unknown","Unknown");
		// name = "UnKnown";
		// gender = " UnKnown";
	 
	 }
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	Person(String name, String gender){
		 this.name  = name;
		 this.gender = gender;
		 		 
	 }
	// Declare the behavior
	 void display(){
		 System.out.println("Name : " + name + "\n Gender :" + gender);
		 System.out.println(cont.getEmail() + " " + cont.getMobile());
	 }
}
