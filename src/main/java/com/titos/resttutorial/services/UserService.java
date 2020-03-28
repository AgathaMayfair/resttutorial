package com.titos.resttutorial.services;

import java.util.List;

import com.titos.resttutorial.entities.User;

public interface UserService {
	
	public User create(User user);
	
	public User findByID(Integer id);
	
	public List<User> findAll();
	
	public User update(User user);
	
	public void deleteByID(Integer id);

}
