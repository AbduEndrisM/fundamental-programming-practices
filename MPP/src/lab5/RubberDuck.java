package lab5;

public class RubberDuck extends Duck{

	public RubberDuck() {
		// TODO Auto-generated constructor stub
		this.flyBehav = new CannotFly();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Rubber Duck:");
	}

}
