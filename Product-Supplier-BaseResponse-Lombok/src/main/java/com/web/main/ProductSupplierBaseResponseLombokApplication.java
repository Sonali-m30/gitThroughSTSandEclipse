package com.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.main.model.Product;
//Angular Project Task -- 28 April 23 --ProductSupplierTask

@SpringBootApplication
public class ProductSupplierBaseResponseLombokApplication {

	public static void main(String[] args) {
		System.out.println("ProductSupplier using Lombok");
		SpringApplication.run(ProductSupplierBaseResponseLombokApplication.class, args);
		Product p=new Product();
	
	}

}
