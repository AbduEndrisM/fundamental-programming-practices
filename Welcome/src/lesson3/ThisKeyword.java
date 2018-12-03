package lesson3;

class student{  
	int id;  
	String name;  

	student(int id,String name){  
		this.id = id;  
		//this.name = name;  
		//id = id;  
		name = name; 
	}  
	void display()
	{
		System.out.println(id+" "+name);
	}
}
public class ThisKeyword {
	public static void main(String args[]){  
		student s1 = new student(111,"Karan");  
		student s2 = new student(321,"Arun");  
		s1.display();  
		s2.display();  
	}  
}
