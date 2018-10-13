package _1;

/*  Write a program which will find all such numbers which are divisible by 7
 *  but are not a multiple of 5, between 2000 and 3200 (both included).
 *  The numbers obtained should be printed in a comma-separated sequence on a single line.
*/
public class CalculateNumbers {
	public static class InvalidInputException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	int start;
	int end;

	public CalculateNumbers(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		validateInput();
	}

	public String calculate() {
		String result = formResult();
		return removeTheLastSeperator(result);
	}

	private void validateInput() {
		if (start > end)
			throw new InvalidInputException();
	}

	private String formResult() {
		String result = "";
		for (int i = start; i <= end; i++) {
			if (isValidNumber(i))
				result += i + ",";
		}
		return result;
	}

	private boolean isValidNumber(int i) {
		return i % 7 == 0 && i % 5 != 0;
	}

	private String removeTheLastSeperator(String result) {
		return result.substring(0, result.length() - 1);
	}
}
