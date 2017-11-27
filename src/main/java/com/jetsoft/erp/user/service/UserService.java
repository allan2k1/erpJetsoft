package com.jetsoft.erp.user.service;

import java.util.List;

import com.jetsoft.erp.user.model.UserJet;

public interface UserService {

	public UserJet create(UserJet user);

	public void delete(long id);

	public UserJet edit(UserJet user);

	public List<UserJet> list();
}
