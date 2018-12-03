package lesson5.shape;

//Super class / Parent Class
public class Shape {
	private String color;
	private String name;
	Shape(String color, String name){
		this.color =color;
		this.name = name;
	}
	// Default Constructor
	Shape(){
		System.out.println("Super Shape");
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double area(){
		return 0.0;
	}
}
