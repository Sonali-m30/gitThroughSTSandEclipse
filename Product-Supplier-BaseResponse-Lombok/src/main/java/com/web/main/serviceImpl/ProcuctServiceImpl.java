package com.web.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.exceptions.NoSuchProductException;
import com.web.main.exceptions.ProductNotFoundForDelete;
import com.web.main.exceptions.SupplierNotFoundException;
import com.web.main.model.Product;
import com.web.main.model.Supplier;
import com.web.main.repository.ProductRepository;
import com.web.main.repository.SupplierRepository;
import com.web.main.service.ProductService;

@Service
public class ProcuctServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	SupplierRepository supplierRepository;

	@Override
	public Product saveProductDetails(Product product, int supplierId) {

		Optional<Supplier> suppliers = supplierRepository.findById(supplierId);

		if (suppliers.isPresent()) {
			product.setSupplier(suppliers.get());
			return productRepository.save(product);
		} else {
			throw new SupplierNotFoundException();
		}
	}

	@Override
	public List<Product> getAllProductSupplierDetails() {

		return productRepository.findAll();
	}

	@Override
	public Product updateDetails(Product product, int productId) {

		Optional<Product> listForUpdate = productRepository.findById(productId);

		if (listForUpdate.isPresent()) {
			product.setProductId(listForUpdate.get().getProductId());

			return productRepository.save(product);
		}
		else {
			throw new NoSuchProductException();
		}
	}

	@Override
	public void deleteProductDetails(int productId) {
		
		Optional<Product> listforDelete=productRepository.findById(productId);
		
		System.out.println(listforDelete);
		
		if(listforDelete.isPresent()) {
		    
	       productRepository.deleteById(productId);
		}
		else {
		   throw new ProductNotFoundForDelete();
		}
		
	}

}
