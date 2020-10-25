package com.grov.primitives;

/**
 * Enum mapping primitive types to their String Class Name.
 * 
 * @author Ethan Bowen
 */
public enum PrimitiveType {
	INT("int"),
	FLOAT("float"),
	DOUBLE("double"),
	SHORT("short"),
	LONG("long"),
	BOOLEAN("boolean"),
	BYTE("byte"),
	CHAR("char");
	
	private String value;
	
	PrimitiveType(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
