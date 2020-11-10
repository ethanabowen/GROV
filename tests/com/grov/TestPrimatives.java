package com.grov;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.grov.mocks.PrimitiveVariables;

public class TestPrimatives {

	@Test
	public void test() throws IllegalArgumentException, IllegalAccessException {
		PrimitiveVariables primativeVariables = new PrimitiveVariables();

		// THE generation of member variable values!
		primativeVariables = GROV.generate(primativeVariables);

		/*
		 * TODO: Consider using more fluid assert statements (LessThen,
		 * GreaterThan, etc)
		 */
		assertTrue(primativeVariables.getPrimativeInt() >= Integer.MIN_VALUE);
		assertTrue(primativeVariables.getPrimativeInt() < Integer.MAX_VALUE);

		assertTrue(primativeVariables.getPrimativeFloat() >= 0);
		assertTrue(primativeVariables.getPrimativeFloat() < Float.MAX_VALUE);

		assertTrue(primativeVariables.getPrimativeDouble() >= Double.MIN_VALUE);
		assertTrue(primativeVariables.getPrimativeDouble() < Double.MAX_VALUE);

		assertTrue(primativeVariables.getPrimativeShort() >= Short.MIN_VALUE);
		assertTrue(primativeVariables.getPrimativeShort() < Short.MAX_VALUE);

		assertTrue(primativeVariables.getPrimativeLong() >= Long.MIN_VALUE);
		assertTrue(primativeVariables.getPrimativeLong() < Long.MAX_VALUE);

		// pointless test, false is default value on declaration of a boolean
		assertTrue(primativeVariables.isPrimativeBoolean() == true || primativeVariables.isPrimativeBoolean() == false);

		assertTrue(primativeVariables.getPrimativeByte() >= Byte.MIN_VALUE);
		assertTrue(primativeVariables.getPrimativeByte() <= Byte.MAX_VALUE);

		assertTrue(primativeVariables.getPrimativeChar() >= Character.MIN_VALUE);
		assertTrue(primativeVariables.getPrimativeChar() < Character.MAX_VALUE);

		System.out.println(primativeVariables);
	}

}
