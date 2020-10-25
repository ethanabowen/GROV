package com.grov.primitives;

import java.lang.reflect.Field;
import java.util.concurrent.ThreadLocalRandom;

import com.grov.utility.FieldUtilities;

/**
 * Generates random values for all Java primitives.
 * 
 * @author Ethan Bowen
 *
 */
public class PrimitiveGenerator {
	private ThreadLocalRandom rand = ThreadLocalRandom.current();

	/**
	 * Given and object and a field (associated with that object), 
	 * assign a random value to the field based on its' primitive type
	 * @param object - object with field association
	 * @param field - field to assign random primitive-oriented value
	 */
	public void generatePrimitiveValue(Object object, Field field) {
		String fieldTypeName = FieldUtilities.getTypeName(field);
		
		try {
			switch (fieldTypeName) {
			case "int":
				field.setInt(object, getRandomInt());
				break;
			case "float":
				field.setFloat(object, getRandomFloat());
				break;
			case "double":
				field.setDouble(object, getRandomDouble());
				break;
			case "short":
				field.setShort(object, getRandomShort());
				break;
			case "long":
				field.setLong(object, getRandomLong());
				break;
			case "boolean":
				field.setBoolean(object, getRandomBoolean());
				break;
			case "byte":
				field.setByte(object, getRandomByte());
				break;
			case "char":
				field.setChar(object, getRandomChar());
				break;
			}
		} catch (IllegalArgumentException e) {
			/* TODO: consider more performant way to build these error responses */
			System.err.println("Failed to assign field: " + field.getName() + " fieldType: " + fieldTypeName);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.err.println("Failed to assign fieldTypeName" + field.getName() + " fieldType: " + fieldTypeName);
			e.printStackTrace();
		}

	}

	/**
	 * Generate a random int between Integer Min (inclusive) and Max (exclusive) values
	 * 
	 * @return random int value
	 */
	private int getRandomInt() {
		return rand.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * Generate a random float between 0 (inclusive) and the float Max (inclusive) values
	 * 
	 * @return random float value
	 */
	private float getRandomFloat() {
		return rand.nextFloat() * Float.MAX_VALUE;
	}

	/**
	 * Generate a random double between Double Min (inclusive) and Max (exclusive)  values
	 * 
	 * @return random double value
	 */
	private double getRandomDouble() {
		return rand.nextDouble(Double.MIN_VALUE, Double.MAX_VALUE);
	}

	/**
	 * Generate a random short between Short Min (exclusive) and Max (exclusive) values
	 * 
	 * @return random short value
	 */
	private short getRandomShort() {
		/* TODO: Consider refactor for Min inclusivity */
		return (short) (rand.nextInt() % Short.MAX_VALUE);
	}

	/**
	 * Generate a random long between Long Min (inclusive) and Max (exclusive) values
	 * 
	 * @return random long value
	 */
	private long getRandomLong() {
		return rand.nextLong(Long.MIN_VALUE, Long.MAX_VALUE);
	}

	/**
	 * Generate a random boolean value - true or false
	 * 
	 * @return random boolean value
	 */
	private boolean getRandomBoolean() {
		return rand.nextBoolean();
	}

	/**
	 * Generate a random byte value
	 * 
	 * @return random byte value
	 */
	private byte getRandomByte() {
		/* TODO: Hacky, refactor to use actual value limits */
		byte[] bytes = new byte[1];
		rand.nextBytes(bytes); // populates byte array with a single byte
		return bytes[0];
	}

	/**
	 * Generate a random char between Character Min (inclusive) and Max (exclusive) values
	 * 
	 * @return random char value
	 */
	private char getRandomChar() {
		/* TODO: Consider making only Alphanumeric Characters */
		return (char) rand.nextInt(Character.MIN_VALUE, Character.MAX_VALUE);
	}

}
