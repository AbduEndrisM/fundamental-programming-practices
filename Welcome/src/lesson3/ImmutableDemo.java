package lesson3;

 
//How to make Immutable class
final class Contacts {  // 1. Make your as final to avoid inheritance
// 2. Make all the fields as private	
 private final String name;
 private final String mobile;

 // 3. Initialize the fields through constructor
 public Contacts(String name, String mobile) {
     this.name = name;
     this.mobile = mobile;
 }

 // 4. Don't provide setters, and getter need to return immutable objects
 public String getName(){
     return name;
 }

 public String getMobile(){
     return mobile;
 }
 
}

public class ImmutableDemo {
		public static void main(String[] args) {
			Contacts p1 = new Contacts("Abdu","123-672-1234");
			System.out.println(p1.getName() + " " + p1.getMobile());
		}

}
