package com.jetsoft.erp.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jetsoft.erp.user.model.UserJet;

@Repository
public interface UserRepository extends CrudRepository<UserJet, Long> {

}
