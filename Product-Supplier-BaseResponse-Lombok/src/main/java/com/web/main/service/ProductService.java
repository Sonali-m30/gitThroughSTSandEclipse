package com.web.main.service;

import java.util.List;

import com.web.main.model.Product;

public interface ProductService {

	public Product saveProductDetails(Product product, int supplierId);

	public List<Product> getAllProductSupplierDetails();

	public Product updateDetails(Product product, int productId);

	public void deleteProductDetails(int productId);

}
