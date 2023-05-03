package com.web.main.service;

import java.util.List;

import com.web.main.model.Supplier;

public interface SupplierService {

	public Supplier saveSupplierDetails(Supplier supplier);

	public List<Supplier> getAllSuppliers();

}
