/*******************************************************************************
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2018年10月11日
 *******************************************************************************/

package com.sdu.software.goingmerry.service.impl;

import org.springframework.stereotype.Service;

import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.entity.User;
import com.sdu.software.goingmerry.service.ILoginService;

@Service
public class LoginService implements ILoginService {

	@Override
	public User updateUserPassword(String userId, User user) throws GoingMerryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(User user) throws GoingMerryException {
		user.setToken("ojbk");
		return user;
	}
}
