package com.jetsoft.erp.user.controller;

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

import com.jetsoft.erp.user.model.UserJet;
import com.jetsoft.erp.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService;

	@PostMapping(value="/user")
	public void createUser(@RequestBody UserJet user) {
		userService.create(user);
	}

	@DeleteMapping(value="/user/{id}")
	public void deteteUser(@PathVariable("id") final Long id) {
		userService.delete(id);
	}

	@PutMapping(value="/user")
	public void editUser(@RequestBody UserJet user) {
		userService.edit(user);
	}

	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserJet> listUser() {
		return userService.list();
	}

}
