package com.jetsoft.erp.product.service;

import java.util.List;

import com.jetsoft.erp.product.model.Product;

public interface ProductService {

	public void delete(long id);

	public Product edit(Product product);
	
	public Product create(Product product);

	public List<Product> list();
}
