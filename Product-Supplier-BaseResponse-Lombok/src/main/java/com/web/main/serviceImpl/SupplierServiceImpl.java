package com.web.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.model.Supplier;
import com.web.main.repository.SupplierRepository;
import com.web.main.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	SupplierRepository supplierRepository;

	@Override
	public Supplier saveSupplierDetails(Supplier supplier) {
		
		return supplierRepository.save(supplier);
	}

	@Override
	public List<Supplier> getAllSuppliers() {
	
		return supplierRepository.findAll();
	}
	
}
