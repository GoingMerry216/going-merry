package com.sdu.software.goingmerry.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.common.ResultList;
import com.sdu.software.goingmerry.controller.IUserController;
import com.sdu.software.goingmerry.service.IUserService;

import entity.User;

@Controller
public class UserController implements IUserController {

	@Autowired
	IUserService userService;
	
	@Override
	public ResultList<User> listUser(int page, int size) throws GoingMerryException {
		return userService.listUser(page, size);
	}

	@Override
	public User getUser(String userId) throws GoingMerryException {
		return userService.getUser(userId);
	}

	@Override
	public User createUser(User user) throws GoingMerryException {
		return userService.createUser(user);
	}

	@Override
	public User updateUser(String userId, User user) throws GoingMerryException {
		return userService.updateUser(userId, user);
	}

	@Override
	public User updateUserPassword(String userId, User user) throws GoingMerryException {
		return userService.updateUserPassword(userId, user);
	}

	@Override
	public User deleteUser(String userId, User user) throws GoingMerryException {
		return userService.deleteUser(userId, user);
	}

	@Override
	public User login(User user) throws GoingMerryException {
		return userService.login(user);
	}

}
