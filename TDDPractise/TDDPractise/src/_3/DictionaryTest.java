package _3;

import java.util.Dictionary;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/*
	Approaches : 
	1. Class with static method.
	2. Class with one state variable, method to calculate and populate squares 
		(can be a constructor), print method.
	
	In this scenario, static method is totally fine. But from 
	re-usability perspective having a non static class is good
	as we would be separating the displaying form the data structure
	and both can be changed independently (Displaying and populating).
	
	
	Second Design Decision:
	The constructor can populate the data structure.
	Or we could have a separate method for populating the data structure.
	
	One main reason to have a different method is to be able to edit it afterwards.
	

*/

public class DictionaryTest {
	MyDictionary dict;
	
	@Before
	public void setUp()
	{
		dict = new MyDictionary();
	}
	
	@Test(expected = MyDictionary.NotPositiveInteger.class)
	public void validatePositiveInput()
	{
		dict.populate(0);
	}

	@Test(expected = MyDictionary.NotPositiveInteger.class)
	public void validateNegativeInput()
	{
		dict.populate(-1);
	}
	
	@Test
	public void one_value_test()
	{
		dict.populate(1);
		Assert.assertEquals("{1: 1}", dict.print());
	}
	
	@Test
	public void two_values_test()
	{
		dict.populate(2);
		Assert.assertEquals("{1: 1, 2: 4}", dict.print());
	}
	

}
