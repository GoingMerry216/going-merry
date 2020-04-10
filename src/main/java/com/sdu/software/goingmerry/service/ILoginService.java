/*******************************************************************************
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2018年10月11日
 *******************************************************************************/

package com.sdu.software.goingmerry.service;

import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.model.User;

public interface ILoginService {
	public User updateUserPassword(String userId, User user) throws GoingMerryException;

	public User login(User user) throws GoingMerryException;
}
