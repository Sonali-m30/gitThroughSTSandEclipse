package com.web.main.exceptions;

public class SupplierNotFoundException extends RuntimeException{
	
	static  String MSG="Supplier Is Not In a DataBase...";
	
	public SupplierNotFoundException() {
		super(MSG);
	}

}
