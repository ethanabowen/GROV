package com.grov.utility;

import java.lang.reflect.Field;

/**
 * Utility functions for the java.lang.reflect.Field 
 * 
 * @author Ethan Bowen
 */
public class FieldUtilities {
	public static <T> String getTypeName(Field field) {
		Class<?> fieldClass = field.getType();

		return fieldClass.getName();
	}
}
