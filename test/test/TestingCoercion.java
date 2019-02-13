package test;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestingCoercion {

	@Test
	public void multiply2x2() {
		MyClass myClass = new MyClass();
		assertEquals(myClass.multiply(2, 2), 4);
	}

	@Test
	public void multiplyOnlyWorksOnInts() {
		try {
			MyClass.class.getMethod("multiply", int.class, int.class);
			assertEquals(1, Arrays.stream(MyClass.class.getMethods()).filter(x -> x.getName().equals("multiply")).count());
		} catch (NoSuchMethodException noSuchMethodException) {
			// test has failed.
			System.out.println(noSuchMethodException);
			fail();
		}
	}


	class MyClass {
		public int multiply(int i, int j) {
			return i * j;
		}
	}
}
