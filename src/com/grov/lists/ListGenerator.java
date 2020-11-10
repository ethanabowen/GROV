package com.grov.lists;

import java.lang.reflect.Field;
import java.util.concurrent.ThreadLocalRandom;

import com.grov.utility.FieldUtilities;

/**
 * Generates random values for all Java primitives.
 * 
 * @author Ethan Bowen
 *
 */
public class ListGenerator {
	private ThreadLocalRandom rand = ThreadLocalRandom.current();

	/**
	 * Given and object and a field (associated with that object), assign a
	 * random value to the field based on its' list type
	 * 
	 * @param object
	 *            - object with field association
	 * @param field
	 *            - field to assign random primitive-oriented value
	 */
	public void generateList(Object object, Field field) {
		String fieldTypeName = FieldUtilities.getTypeName(field);

		try {
			/** TODO **/
		} catch (IllegalArgumentException e) {
			/*
			 * TODO: consider more performant way to build these error responses
			 */
			System.err.println("Failed to assign field: " + field.getName() + " fieldType: " + fieldTypeName);
			e.printStackTrace();
		} 
//		catch (IllegalAccessException e) {
//			System.err.println("Failed to assign fieldTypeName" + field.getName() + " fieldType: " + fieldTypeName);
//			e.printStackTrace();
//		}
	}
}
