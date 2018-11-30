import static org.junit.Assert.*;

import org.junit.Test;

public class myTest {

	 @Test
	public void test() {
	StringFunction sf = new StringFunction();
	String Ooutput = sf.StringJoin("Renuka",
	"Mohanraj");
	String Eoutput = "RenukaMohanraj";
	assertEquals(Ooutput,Eoutput);
	}
	 
	@Test
	public void test2()
	{
	StringFunction sf = new StringFunction();
	int ao =sf.Multiply(10, 20);
	int eo = 200;
	assertEquals(ao,eo);
	}
	
	
	
	

}
