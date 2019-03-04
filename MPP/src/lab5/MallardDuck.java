package lab5;

public class MallardDuck extends Duck {
	public MallardDuck() {
		this.flyBehav = new FlyWithWings();
//		this.quackBehav = new Quac
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Maller Duck:");
	}

}
