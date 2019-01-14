package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

import exams.additional.prob2.Main;

public class HelloWorldTest {

	HelloWorld  h = new HelloWorld();
	@Test
	public void test() {
		assertEquals("Hello",HelloWorld.Abdu());
	}

}
