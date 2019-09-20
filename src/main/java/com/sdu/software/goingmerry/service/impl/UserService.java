package com.sdu.software.goingmerry.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.common.ResultList;
import com.sdu.software.goingmerry.dao.UserDao;
import com.sdu.software.goingmerry.entity.User;
import com.sdu.software.goingmerry.service.IUserService;

@Service
@Transactional(rollbackFor = Throwable.class)
public class UserService implements IUserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public ResultList<User> listUser(int page, int size) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userId) throws GoingMerryException {
		return userDao.selectById(userId);
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
	public User deleteUser(String userId, User user) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

}
