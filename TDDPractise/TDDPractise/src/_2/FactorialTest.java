package _2;

import java.math.BigInteger;

import org.junit.Test;

import junit.framework.Assert;

public class FactorialTest {
	@Test(expected = Factorial.NegativeNumberException.class)
	public void negativeCharactersTest() {
		Factorial.calculate(-1);
	}

	@Test
	public void facts() {
		Assert.assertEquals(new BigInteger("1"), Factorial.calculate(0));
		Assert.assertEquals(new BigInteger("1"), Factorial.calculate(1));
		Assert.assertEquals(new BigInteger("2"), Factorial.calculate(2));
	}

	@Test
	public void furtherTest() {
		Assert.assertEquals(new BigInteger("120"), Factorial.calculate(5));
	}

	@Test
	public void biggerNumbersTest() {
		Assert.assertEquals(new BigInteger("3628800"), Factorial.calculate(10));
		Assert.assertEquals(new BigInteger("39916800"),
				Factorial.calculate(11));
		Assert.assertEquals(new BigInteger("479001600"),
				Factorial.calculate(12));
		intOverflowCases();
	}

	private void intOverflowCases() {
		Assert.assertEquals(new BigInteger("6227020800"),
				Factorial.calculate(13));
		Assert.assertEquals(new BigInteger("1124000727777607680000"),
				Factorial.calculate(22));
		Assert.assertEquals(
				new BigInteger(
						"815915283247897734345611269596115894272000000000"),
				Factorial.calculate(40));
	}
}
