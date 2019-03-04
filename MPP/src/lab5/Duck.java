package lab5;

public abstract class Duck {
	QuackBehavior quackBehav;
	FlyBehavior flyBehav;
	
	
	public void quack() {
		quackBehav.quack();
		flyBehav.fly();
	}
	
	public void swim() {
		System.out.println("Can swim");
		
	}
	public abstract void display() ; 
}
