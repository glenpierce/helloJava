package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TestingCoercion {

	@Test
	public void multiply2x2() {
		MyClass myClass = new MyClass();
		Assert.assertEquals(myClass.multiply(2, 2), 4);
	}

	@Test
	public void multiplyDoesNotWorkWithFloat() {
		MyClass myClass = new MyClass();
		try {
			myClass.multiply(2.0, 2); //this code doesn't compile, but how can we test that the method signature hasn't changed?
			fail("MyClass.multiply is only for integers");
		} catch (Exception exception) {
			Assert.assertTrue("MyClass.multiply correctly rejected a double", true);
		}
	}


	class MyClass {
		public int multiply(int i, int j) {
			return i * j;
		}
	}
}
