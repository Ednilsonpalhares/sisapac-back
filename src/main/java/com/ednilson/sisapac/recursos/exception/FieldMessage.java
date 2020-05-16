package com.ednilson.sisapac.recursos.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String message;
	
	public FieldMessage() {}

	public FieldMessage(String fielName, String message) {
		super();
		this.fieldName = fielName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
