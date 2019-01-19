package GUI4;

import java.util.HashMap;

public class Student {

	private String fName;
	private String lName;

	private int age;
	private String sex;

	public Student(/*String fName, String lName, int age, String sex*/) {
	/*	super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.sex = sex;*/
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return " First Name: "+fName+"\n Last Name: "+lName+"\n Sex:  "+sex+"\n Age: "+age;
		
	}
}
