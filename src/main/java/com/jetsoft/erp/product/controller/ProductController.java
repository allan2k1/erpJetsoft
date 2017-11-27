package com.jetsoft.erp.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jetsoft.erp.product.model.Product;
import com.jetsoft.erp.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@PostMapping(value="/product")
	public void createProduct(@RequestBody Product product){
		productService.create(product);
	}
	
	@DeleteMapping(value="/product/{id}")
	public void deteteProduct(@PathVariable("id") final Long id){
		productService.delete(id);
	}
	
	@PutMapping(value="/product")
	public void editProduct(@RequestBody Product product){
		productService.edit(product);
	}
	
	@GetMapping (value="/product", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> listProduct(){
		return productService.list();
	}
}
