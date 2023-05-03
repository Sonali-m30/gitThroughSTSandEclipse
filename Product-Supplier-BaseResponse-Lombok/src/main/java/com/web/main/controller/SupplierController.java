package com.web.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.Supplier;
import com.web.main.response.BaseResponse;
import com.web.main.service.SupplierService;

@CrossOrigin("*")
@RestController
@RequestMapping("/sup")
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	@PostMapping("/addSupplier")
	public ResponseEntity<BaseResponse<Supplier>> saveSupplier(@RequestBody Supplier supplier) {
		
		Supplier addSupplier=supplierService.saveSupplierDetails(supplier);
		
        BaseResponse<Supplier> baseResponse=new BaseResponse<Supplier>(201,"Supplier Added...", addSupplier);	
		
        return new ResponseEntity<BaseResponse<Supplier>>(baseResponse,HttpStatus.CREATED);
	}
	
	@GetMapping("/viewSuppliers")
	public ResponseEntity<BaseResponse<List<Supplier>>> showSuppliers(){
		
		List<Supplier> getSuppliers=supplierService.getAllSuppliers();
		
		BaseResponse<List<Supplier>> baseResponse=new BaseResponse<List<Supplier>>(200,"Suppliers Fetched...", getSuppliers);
		
        return new ResponseEntity<BaseResponse<List<Supplier>>>(baseResponse,HttpStatus.OK);
		
	}
}
