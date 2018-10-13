package _1;

import org.junit.Test;

import junit.framework.Assert;

public class PrintNumbersTest {

	@Test(expected = PrintNumbers.InvalidInputException.class)
	public void validateInputTest() {
		PrintNumbers.print(20, 2);
	}

	@Test
	public void oneValueTest() {
		Assert.assertEquals("2002", PrintNumbers.print(2000, 2003));
	}

	@Test
	public void twoValuesTest() {
		Assert.assertEquals("2002,2009", PrintNumbers.print(2000, 2010));
	}

	@Test
	public void otherConditionTest() {
		Assert.assertEquals("2002,2009,2016,2023,2037",
				PrintNumbers.print(2000, 2040));
		
		Assert.assertEquals("2002,2009,2016,2023,2037,2044,2051,2058,2072,2079", PrintNumbers.print(2000, 2080));
	}

}
