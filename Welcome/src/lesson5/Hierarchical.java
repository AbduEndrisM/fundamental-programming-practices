package lesson5;


import java.util.Arrays;

// Demo code for Hierarchical Inheritance
class employee1 {
	String en;
	String ssn;
	int phone;
	
	public employee1(String en, String ssn, int phone) {
		this.en = en;
		this.ssn = ssn;
		this.phone = phone;
	}

		void display() {
		System.out.println("Name of the Employee = " + en);
		System.out.println("Social Security Number = " + ssn);
		System.out.println("Mobile Number = " + phone);
	}
}

class faculty extends employee1 {
	String sub[]; 
	public faculty(String en, String ssn, int phone, String sub[]) {
		super(en, ssn, phone);
		this.sub = sub;
	}

	
	@Override
	public String toString() {
		return "Faculty Name =" + en + " \nSSN =" + ssn + "\nPhone=" + phone 
				+ "\nCourses : " + Arrays.toString(sub);
	}
}

class staff extends employee1 {
    String pos;
	public staff(String en, String ssn, int phone, String pos) {
		super(en, ssn, phone);
		this.pos =  pos;
	}
	@Override
	public String toString() {
		return "Staff Name=" + en + "\nSSN=" + ssn + "\nPhone=" + phone + "\nPosition=" + pos;
	}
	
	
}

public class Hierarchical {
	public static void main(String[] args) {
		String[] course = {"FPP","MPP","DS"};
		employee1 f1 = new faculty("Renuka", "123-456", 12345,course );
		System.out.println("Faculty Details");
		System.out.println("----------------");
		System.out.println(f1);
		employee1 s1 = new staff("Asha", "124-789", 456789,"Student Director");
		System.out.println("\nStaff Details");
		System.out.println("----------------");
		System.out.println(s1);
	}

}
