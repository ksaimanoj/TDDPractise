package _2;

public class Factorial {
	public static class NegativeNumberException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public static int calculate(int value) {
		if(value < 0)
			throw new NegativeNumberException();
		int result = 1;
		for(int i = 1; i <= value; i++)
			result *= i;
		return result;
	}
}
