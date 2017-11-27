package com.jetsoft.erp.product.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetsoft.erp.product.model.Product;
import com.jetsoft.erp.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;
	
	public Product create(Product product){
		return productRepo.save(product);
		
	}
	
	public void delete(long id){
		productRepo.delete(id);
	}
	
	public Product edit(Product product){
		return productRepo.save(product);
	}

	public List<Product> list() {
		Iterable<Product> iterator = productRepo.findAll();
		return StreamSupport
		    .stream(iterator.spliterator(), false)
		    .collect(Collectors.toList());
	 }
}
