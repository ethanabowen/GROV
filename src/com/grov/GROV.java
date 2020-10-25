package com.grov;

import java.lang.reflect.Field;

import com.grov.primitives.PrimitiveGenerator;

/**
 * Generate Random Object Values
 * 
 * Given a Java Object, GROV will recursively generate values for it's member
 * variables.
 * 
 * @author Ethan Bowen
 */
public class GROV {

	private static PrimitiveGenerator PrimitiveWorker = new PrimitiveGenerator();

	/**
	 * Iterate over every member variable and assign a randomly generated value.
	 * 
	 * @param object
	 *            - object with member variables that will be assigned
	 * @return - object with randomly generated member variable values
	 */
	public static <T> T generate(T object) {
		Field[] memberFields = object.getClass().getDeclaredFields();
		for (Field memberField : memberFields) {
			// allows private member variables to be accessed
			memberField.setAccessible(true);

			// get field
			Class<?> fieldClass = memberField.getType();
			if (fieldClass.isPrimitive()) {
				PrimitiveWorker.generatePrimitiveValue(object, memberField);
			} else {
				/* TODO: Object generation 
				 * 
				 * if isArray
				 * else if isList
				 * else if isMap
				 * else anything else that can be gen-ed
				 * else recurse
			    */
			}

			// reset member variable access to Java language constraints
			memberField.setAccessible(true);
		}
		return object;
	}
}
