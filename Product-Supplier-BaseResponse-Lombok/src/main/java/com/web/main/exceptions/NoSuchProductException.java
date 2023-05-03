package com.web.main.exceptions;

public class NoSuchProductException extends RuntimeException{
	
	static  String MSG="Product Is Not In a DataBase To Edit...";
	
	public NoSuchProductException() {
		super(MSG);
	}

}
