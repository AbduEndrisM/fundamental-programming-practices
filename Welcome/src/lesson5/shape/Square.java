package lesson5.shape;


//Derived class or sub class / Child class
public class Square extends Shape{
	private double side;
	Square(){
		}
	Square(String color, String name, double side){
		super(color,name);
		this.side = side;
	}
	@Override // Overriding method from the parent, as well get the benefit of Compiler check
	double area(){
		return side * side;
	}

}
