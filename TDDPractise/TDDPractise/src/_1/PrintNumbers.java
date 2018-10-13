package _1;

/*  Write a program which will find all such numbers which are divisible by 7
 *  but are not a multiple of 5, between 2000 and 3200 (both included).
 *  The numbers obtained should be printed in a comma-separated sequence on a single line.
*/
public class PrintNumbers {

	public static class InvalidInputException extends RuntimeException {

	}

	public static String print(int start, int end) {
		validateInput(start, end);
		String result = formResult(start, end);
		return removeTheLastSeperator(result);
	}

	private static void validateInput(int start, int end) {
		if (start > end)
			throw new InvalidInputException();
	}

	private static String formResult(int start, int end) {
		String result = "";
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0 && i % 5 != 0)
				result += i + ",";
		}
		return result;
	}

	private static String removeTheLastSeperator(String result) {
		return result.substring(0, result.length() - 1);
	}

}
