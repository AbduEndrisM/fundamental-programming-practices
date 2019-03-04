package lab5;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		// TODO Auto-generated constructor stub
		this.flyBehav = new CannotFly();
//		this.quackBehav =  new Sq
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Redhead Duck:");
	}

}
