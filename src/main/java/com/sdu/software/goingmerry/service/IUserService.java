package com.sdu.software.goingmerry.service;

import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.common.ResultList;
import com.sdu.software.goingmerry.entity.User;

public interface IUserService {

	public ResultList<User> listUser(int page, int size) throws GoingMerryException;

	public User getUser(String userId) throws GoingMerryException;

	public User createUser(User user) throws GoingMerryException;

	public User updateUser(String userId, User user) throws GoingMerryException;

	public User deleteUser(String userId, User user) throws GoingMerryException;

}
