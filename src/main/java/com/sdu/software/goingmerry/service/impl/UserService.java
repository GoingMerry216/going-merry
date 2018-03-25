package com.sdu.software.goingmerry.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.common.ResultList;
import com.sdu.software.goingmerry.service.IUserService;

import entity.User;

@Service
@Transactional(rollbackFor = Throwable.class)
public class UserService implements IUserService {

	@Override
	public ResultList<User> listUser(int page, int size) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userId) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(String userId, User user) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserPassword(String userId, User user) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(String userId, User user) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(User user) throws GoingMerryException {
		user.setToken("ojbk");
		return user;
	}

}
