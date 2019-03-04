package lab5;

public class DecoyDuck extends Duck{

	public  DecoyDuck() {
		// TODO Auto-generated constructor stub
	
	this.flyBehav = new CannotFly();
//			this.quackBehav = new 
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("Decoy Duck:");	
	}

	
}
