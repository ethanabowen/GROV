package com.grov.lists;

/**
 * Enum mapping primitive types to their String Class Name.
 * 
 * @author Ethan Bowen
 */
public enum ListTypes {
	INT("int"),
	FLOAT("float"),
	DOUBLE("double"),
	SHORT("short"),
	LONG("long"),
	BOOLEAN("boolean"),
	BYTE("byte"),
	CHAR("char");
	
	private String value;
	
	ListTypes(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
