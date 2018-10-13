package _2;

import org.junit.Test;

import junit.framework.Assert;

public class FactorialTest {
	@Test(expected = Factorial.NegativeNumberException.class)
	public void negativeCharactersTest() {
		Factorial.calculate(-1);
	}

	@Test
	public void facts() {
		Assert.assertEquals(1, Factorial.calculate(0));
		Assert.assertEquals(1, Factorial.calculate(1));
		Assert.assertEquals(2, Factorial.calculate(2));
	}
	
	@Test
	public void furtherTest()
	{
		Assert.assertEquals(120, Factorial.calculate(5));
	}
}
