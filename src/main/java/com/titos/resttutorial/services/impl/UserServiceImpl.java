package com.titos.resttutorial.services.impl;

import java.util.List;

import com.titos.resttutorial.entities.User;
import com.titos.resttutorial.repositories.UserRepository;
import com.titos.resttutorial.services.UserService;

public class UserServiceImpl implements UserService{
	
	private UserRepository userRep = new UserRepository();

	@Override
	public User create(User user) {
		User userCreated = userRep.save(user);
		return userCreated;
	}

	@Override
	public User findByID(Integer id) {
		User user = userRep.find(id);
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> users = userRep.findAll();
		return users;
	}

	@Override
	public User update(User user) {
		User newUser = userRep.update(user);
		return newUser;
	}

	@Override
	public void deleteByID(Integer id) {
		User deletedUser = userRep.find(id);
		userRep.delete(deletedUser); 
	}

}
