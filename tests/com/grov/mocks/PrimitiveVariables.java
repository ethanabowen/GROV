package com.grov.mocks;

/**
 * Class of every Java primitive as member variables with private access.
 * 
 * @author Ethan Bowen
 */
public class PrimitiveVariables {
	private int primativeInt;
	private float primativeFloat;
	private double primativeDouble;

	private short primativeShort;
	private long primativeLong;

	private boolean primativeBoolean;
	private byte primativeByte;
	private char primativeChar;

	public int getPrimativeInt() {
		return primativeInt;
	}

	public float getPrimativeFloat() {
		return primativeFloat;
	}

	public double getPrimativeDouble() {
		return primativeDouble;
	}

	public short getPrimativeShort() {
		return primativeShort;
	}

	public long getPrimativeLong() {
		return primativeLong;
	}

	public boolean isPrimativeBoolean() {
		return primativeBoolean;
	}

	public byte getPrimativeByte() {
		return primativeByte;
	}

	public char getPrimativeChar() {
		return primativeChar;
	}

	@Override
	public String toString() {
		return "PrimativeVariables [\nprimativeInt=" + primativeInt + ",\nprimativeFloat=" + primativeFloat
				+ ",\nprimativeDouble=" + primativeDouble + ",\nprimativeShort=" + primativeShort + ",\nprimativeLong="
				+ primativeLong + ",\nprimativeBoolean=" + primativeBoolean + ",\nprimativeByte=" + primativeByte
				+ ",\nprimativeChar=" + primativeChar + "]";
	}
}
