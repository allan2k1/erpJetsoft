package com.jetsoft.erp.user.controller;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jetsoft.erp.JetsoftApplication;
import com.jetsoft.erp.product.model.Product;
import com.jetsoft.erp.user.model.UserJet;
import com.jetsoft.erp.user.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes=JetsoftApplication.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@After
	public void clearDb() {
		userRepository.deleteAll();
	}

	@Test
	public void findUserByIdAndVerifyName() throws Exception {
		UserJet userExpected = this.userRepository.save(new UserJet("Allan", "43059616876", "allan2k1", "12345678", new ArrayList<Product>()));
		UserJet userActual = this.userRepository.findOne(userExpected.getId());
		assertTrue(userExpected.equals(userActual));
	}	
}
