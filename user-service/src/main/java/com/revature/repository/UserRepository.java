package com.revature.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
	

}
