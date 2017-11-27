package com.jetsoft.erp.user.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetsoft.erp.user.model.UserJet;
import com.jetsoft.erp.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;
	
	public UserJet create(UserJet user){
		return userRepo.save(user);
		
	}
	
	public void delete(long id){
		userRepo.delete(id);
	}
	
	public UserJet edit(UserJet user){
		return userRepo.save(user);
	}

	public List<UserJet> list() {
		Iterable<UserJet> iterator = userRepo.findAll();
		return StreamSupport
		    .stream(iterator.spliterator(), false)
		    .collect(Collectors.toList());
	 }
}
