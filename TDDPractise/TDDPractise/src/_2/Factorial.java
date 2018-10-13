package _2;

public class Factorial {
	public static class NegativeNumberException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public static int calculate(int value) {
		validateInput(value);
		return calculateFactorial(value);
	}

	private static void validateInput(int value) {
		if(value < 0)
			throw new NegativeNumberException();
	}
	
	private static int calculateFactorial(int value) {
		int result = 1;
		for(int i = 1; i <= value; i++)
			result *= i;
		return result;
	}
}
