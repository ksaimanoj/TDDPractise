package _1;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalculateNumbersTest {

	CalculateNumbers calculateNumbers;

	@Before
	public void setUp() {
		calculateNumbers = new CalculateNumbers(0, 0);
	}

	@Test(expected = CalculateNumbers.InvalidInputException.class)
	public void validateInputTest() {
		calculateNumbers = new CalculateNumbers(20, 2);
	}

	@Test
	public void oneValueTest() {
		calculateNumbers = new CalculateNumbers(2000, 2003);
		Assert.assertEquals("2002", calculateNumbers.calculate());
	}

	@Test
	public void twoValuesTest() {
		calculateNumbers = new CalculateNumbers(2000, 2010);
		Assert.assertEquals("2002,2009", calculateNumbers.calculate());
	}

	@Test
	public void otherConditionTest() {
		calculateNumbers = new CalculateNumbers(2000, 2040);
		Assert.assertEquals("2002,2009,2016,2023,2037", calculateNumbers.calculate());

		calculateNumbers = new CalculateNumbers(2000, 2080);
		Assert.assertEquals("2002,2009,2016,2023,2037,2044,2051,2058,2072,2079",
				calculateNumbers.calculate());
	}

}
