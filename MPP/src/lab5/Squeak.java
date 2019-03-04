package lab5;

public abstract class Squeak implements QuackBehavior{
	public Squeak() {
		
	}
@Override
	public void quack() {
		System.out.println("Squeaking");
	}

}
