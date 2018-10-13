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
		return (value == 0 || value == 1) ? new BigInteger("1")
				: new BigInteger(value + "")
						.multiply(calculateFactorial(value - 1));
	}
}
