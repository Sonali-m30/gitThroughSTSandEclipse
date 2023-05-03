package com.web.main.exceptions;

public class ProductNotFoundForDelete extends RuntimeException{
	
	static  String MSG="Product is not available in database for delete...";
	
	public ProductNotFoundForDelete() {
		super(MSG);
	}

}
