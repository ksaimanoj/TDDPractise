package _2;

import java.math.BigInteger;

public class Factorial {
	public static class NegativeNumberException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public static BigInteger calculate(int value) {
		validateInput(value);
		return calculateFactorial(value);
	}

	private static void validateInput(int value) {
		if (value < 0)
			throw new NegativeNumberException();
	}

	private static BigInteger calculateFactorial(int value) {
		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= value; i++)
			result = result.multiply(new BigInteger(i+""));
		return result;
	}
}
