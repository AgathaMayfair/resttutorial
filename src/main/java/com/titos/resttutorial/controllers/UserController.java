package com.titos.resttutorial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titos.resttutorial.entities.User;
import com.titos.resttutorial.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
//	private final String sharedKey = "SHARED_KEY";
//	private static final String SUCCESS_STATUS = "success";
//	private static final String ERROR_STATUS = "error";
//	private static final int CODE_SUCCESS = 100;
//	private static final int AUTH_FAILURE = 102;
	
	private UserService userService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User create(@RequestBody User newUser) {
		User response = userService.create(newUser);
		return response;
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public User read(@RequestParam(value = "id") Integer id) {
		User response = userService.findByID(id);
		return response;
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<User> readAll() {
		List<User> response = userService.findAll();
		return response;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public User update(@RequestBody User updatedUser) {
		User response = userService.update(updatedUser);
		return response;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void delete(@RequestParam(value = "id") Integer id) {
		userService.deleteByID(id);
	}

}
