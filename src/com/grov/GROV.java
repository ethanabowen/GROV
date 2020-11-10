package com.grov;

import java.lang.reflect.Field;
import java.util.List;

import com.grov.lists.ListGenerator;
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

	private static PrimitiveGenerator primitiveWorker = new PrimitiveGenerator();
	private static ListGenerator listWorker = new ListGenerator();

	/**
	 * Iterate over every member variable and assign a randomly generated value.
	 * 
	 * @param t
	 *            - generic object with member variables that will be assigned
	 * @return - object with randomly generated member variable values
	 */
	public static <T> T generate(T objectToPopulate) {
		Field[] memberFields = objectToPopulate.getClass().getDeclaredFields();
		for (Field memberField : memberFields) {
			// allows private member variables to be accessed
			memberField.setAccessible(true);

			// get field
			Class<?> fieldClass = memberField.getType();
			if (fieldClass.isPrimitive()) {
				primitiveWorker.generatePrimitiveValue(objectToPopulate, memberField);
			} else {
				/* TODO: Object generation 
				 * 
				 * if isArray
				 * else if isList
				 * else if isMap
				 * else anything else that can be gen-ed
				 * else recurse
			    */
				
				/* 
				 * Determines if the class or interface represented by this Class object is either the same as, 
				 * or is a superclass or superinterface of, the class or interface represented by the specified Class parameter. 
				 * It returns true if so; otherwise it returns false. If this Class object represents a primitive type, 
				 * this method returns true if the specified Class parameter is exactly this Class object; otherwise it returns false.
				 * 
				 * Specifically, this method tests whether the type represented by the specified 
				 * Class parameter can be converted to the type represented by this Class object 
				 * via an identity conversion or via a widening reference conversion.
				 */
				if(memberField.getType().isAssignableFrom(List.class)) {
					listWorker.generateList(objectToPopulate, memberField);
				}
			}

			// reset member variable access to Java language constraints
			memberField.setAccessible(false);
		}
		
		return objectToPopulate;
	}
}
