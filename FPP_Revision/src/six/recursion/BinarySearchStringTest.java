package six.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchStringTest {

	@Test
	public void test() {
		BinarySearchString test = new BinarySearchString();
		
		boolean x = BinarySearchString.binarySearch("abdu", 'b', 0, 4);
		assertEquals(true, x);
		
		boolean y = test.binarySearch("abdu", 'A', 0, 4);
		assertEquals(false, y);
		
	}

}
