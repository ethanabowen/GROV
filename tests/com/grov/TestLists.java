package com.grov;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.grov.mocks.ListVariables;

public class TestLists {

	@Test
	public void test() throws IllegalArgumentException, IllegalAccessException {
		ListVariables listVariables = new ListVariables();

		// THE generation of member variable values!
		listVariables = GROV.generate(listVariables);

		/*
		 * TODO: Consider using more fluid assert statements (LessThen,
		 * GreaterThan, etc)
		 */
		//assertTrue(listVariables.getPrimativeInt() >= Integer.MIN_VALUE);
		//assertTrue(listVariables.getPrimativeInt() < Integer.MAX_VALUE);

		System.out.println(listVariables);
	}

}
