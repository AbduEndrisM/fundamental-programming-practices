package lab5;

public abstract class Quack implements QuackBehavior {
	
	public Quack () {
		
	}
	@Override
	public void quack() {
		System.out.println("Quacking");
	}
}
