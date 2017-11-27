package com.jetsoft.erp.user.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.jetsoft.erp.product.model.Product;

@Entity
public class UserJet implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column(unique = true)
	private String login;
	
	@Column
	private String password;
	
	/*
	 * by default this annotation is lazy loading mode.
	 */
	@OneToMany
	private List<Product> products;
	
	@Column(unique = true)
	private String cpf;
	
	public UserJet(String name, String cpf, String login, String password, List<Product> products) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.login = login;
		this.password = password;
		this.products = products;
	}
	
	public UserJet() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
