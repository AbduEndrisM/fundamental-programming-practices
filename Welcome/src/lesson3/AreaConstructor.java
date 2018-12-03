package lesson3;

 
class Area
{
	Area (int a)
	{
		System.out.println("Area of square =" + a * a);
	}
	Area( int a, int b)
	{
		System.out.println("Area of Rectangle=" + a * b);
	}
	
	Area(int l, int b, int h)
	{
		System.out.println("Area of Cube =" + l * b * h);
	}
}
public class AreaConstructor {

	// Demo code for Constructor overloading
	public static void main(String[] args) {
		Area a1 = new Area(5);
		Area a2 = new Area(5,7);
		Area a3 = new Area(5,7,3);
		//Area[] obj = { new Area(5), new Area(12,8), new Area(5,7,3)};
				
		}

}
