package _3;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary {
	private List<Integer> keys;
	private List<Integer> values;
	
	public void populate(int n) {
		if(n < 1)
			throw new NotPositiveInteger();
		keys = new ArrayList<Integer>();
		values = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++)
		{
			keys.add(i);
			values.add(i * i);
		}
	}

	public String print() {
		String result = "{";
		for(int i = 0; i < keys.size() - 1; i++)
		{
			result += String.format("%d: %d, ", keys.get(i), values.get(i));
		}
		result += String.format("%d: %d}", keys.get(keys.size() - 1), values.get(keys.size() - 1));
		return result;
	}

	public class NotPositiveInteger extends RuntimeException {
		private static final long serialVersionUID = 1L;

	}
}
