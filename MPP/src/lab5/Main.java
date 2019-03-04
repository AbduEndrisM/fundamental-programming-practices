package lab5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck[] ducks = { new MallardDuck(), new RedheadDuck(),new RubberDuck(), new DecoyDuck()};
	
		for(Duck d:ducks) {
			d.display();
			d.swim();
			d.quack();
			//d.fly;
			
			//System.out.println(d.quackBehav);
			
		}
	
	}

}
