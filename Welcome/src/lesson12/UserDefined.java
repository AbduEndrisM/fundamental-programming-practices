package lesson12;
 
class MyException1 extends Exception
{
    MyException1(String message)
    {
           	super(message);
    }
 
}
 public class UserDefined {
		public static void main(String[] args) throws MyException1 {
		
			 int x = 5, y = 100;
		        try
		        {
		            float z = (float)x / (float)y;
		            if(z < 0.01)
		            {
		                throw new MyException1("Number is too small");
		            }
		            if (x<y)
		            {
		            	throw new MyException1("First Number Should greater ");
		            }
		        }
		        catch(MyException1 e)
		        {
		            System.out.println("Caught MyException");
		            System.out.println(e.getMessage());
		        }
		        finally
		        {
		            System.out.println("End of Program");
		        }
	}

}
