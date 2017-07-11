package com.budgetinstagram.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.budgetinstagram.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long>{
	
	List<User> findAll();
	
	User findByUserName(String username);
	
	User findByUserId(Long userId);
	
	User save(User user);
}
