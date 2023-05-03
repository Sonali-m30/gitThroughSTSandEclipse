package com.web.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.Product;
import com.web.main.model.Supplier;
import com.web.main.response.BaseResponse;
import com.web.main.service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/addProduct/{supplierId}")
	public ResponseEntity<BaseResponse<Product>> saveProduct(@RequestBody Product product,@PathVariable int supplierId) {
		
		Product addProduct=productService.saveProductDetails(product,supplierId);
		
        BaseResponse<Product> baseResponse=new BaseResponse<Product>(201,"Product Added...", addProduct);	
		
        return new ResponseEntity<BaseResponse<Product>>(baseResponse,HttpStatus.CREATED);
	}
	
	@GetMapping("/getProductsAndSuppliers")
	public ResponseEntity<BaseResponse<List<Product>>> getAllDetails(){
		
		List<Product> allDetails=productService.getAllProductSupplierDetails();
		
        BaseResponse<List<Product>> baseResponse=new BaseResponse<List<Product>>(200,"Product with Suppliers Fetched...", allDetails);
		
        return new ResponseEntity<BaseResponse<List<Product>>>(baseResponse,HttpStatus.OK);
	}
	
	@PutMapping("/updateProductSupplier/{productId}")
	public ResponseEntity<BaseResponse<Product>> updateData(@RequestBody Product product,@PathVariable int productId) {
		
		Product updateData=productService.updateDetails(product,productId);
		
		BaseResponse<Product> baseResponse=new BaseResponse<Product>(200, "Product is update...", updateData);
        
		return new ResponseEntity<BaseResponse<Product>>(baseResponse,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteOnlyProductUsingDetach/{productId}")
	public ResponseEntity<BaseResponse<Product>> deleteData(@PathVariable int productId) {
		
		productService.deleteProductDetails(productId);
		
		BaseResponse<Product> baseResponse=new BaseResponse<Product>(204, "Product is Deleted...", null)	;
		
		return new ResponseEntity<BaseResponse<Product>>(baseResponse,HttpStatus.NO_CONTENT);		
	}
	
}
