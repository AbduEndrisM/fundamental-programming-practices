package lesson5.problem3;

public class Main {
	public static void main(String[] args)
	{	
	
	Figure [] fig = {new UpwardHat(),
			new DownwardHat(),
			new FaceMaker(),
			new Vertical()
			};
		
		
	
	fig[0].getFigure();
	for(Figure f : fig) {
		f.getFigure();
	}
	
}

}