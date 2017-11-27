package com.jetsoft.erp.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jetsoft.erp.product.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
