package com.jetsoft.erp.product.controller;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jetsoft.erp.JetsoftApplication;
import com.jetsoft.erp.product.model.Product;
import com.jetsoft.erp.product.repository.ProductRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes=JetsoftApplication.class)
public class ProductRepositoryTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	@After
	public void clearDb() {
		productRepository.deleteAll();
	}

	@Test
	public void findProductByIdAndVerifyDesc() throws Exception {
		Product productRequired = this.productRepository.save(new Product("123456", "Celular Motorola", 999.9));
		Product productActual = this.productRepository.findOne(productRequired.getId());
		assertTrue(productRequired.equals(productActual));
	}
	
}
