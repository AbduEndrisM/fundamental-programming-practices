import static org.junit.Assert.*;

import org.junit.Test;

public class StringFunction {
	public String StringJoin(String str1, String str2) {
		if (str1.length() == 0 && str2.length() == 0)
			return "Empty";
		else
			return str1 + str2;
	}

	public int Multiply(int x, int y) {
		return (x * y);
	}
	
	
}