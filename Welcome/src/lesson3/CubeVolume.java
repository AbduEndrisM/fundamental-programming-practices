package lesson3;

 
class Cube 
{ 
    //private  
	  int length; 
      int breadth; 
      int height; 
     /* public void getValue(int x, int y, int z)
      {
    	  length= x ;
    	  breadth = y;
    	  height = z;
    	  
      }*/
      public int getVolume() 
         {
    	  //length = 10;
       return (length * breadth * height); 
    }
}
public class CubeVolume {

	public static void main(String[] args) {
		Cube c1 = new Cube();
		c1.length=10;
		c1.breadth=12;
		c1.height=12;
		//   c1.getValue(10, 12,5);
		   Cube c2 = c1;
		   System.out.println("Volume of Cube is : " + c1.getVolume());
		   System.out.println("Volume of Cube is : " + c2.getVolume());
	}

}
