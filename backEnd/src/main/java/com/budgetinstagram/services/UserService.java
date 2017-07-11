package com.budgetinstagram.services;

import java.util.List;

import com.budgetinstagram.model.User;

public interface UserService {

	List<User> findAllUsers();
	
	User findByUserName(String userName);
	
	User save(User user);
}
