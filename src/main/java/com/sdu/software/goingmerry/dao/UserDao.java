/*******************************************************************************
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2019年9月20日
 *******************************************************************************/


package com.sdu.software.goingmerry.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sdu.software.goingmerry.entity.User;

@Mapper
public interface UserDao {

	@Select("SELECT * FROM GKD_USER WHERE user_id = #{userId}")
	User selectById(@Param(value = "userId") String userId);


}



