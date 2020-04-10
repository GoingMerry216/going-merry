/*******************************************************************************
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2018年10月11日
 *******************************************************************************/

package com.sdu.software.goingmerry.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdu.software.goingmerry.common.Constants;
import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.model.User;
import com.sdu.software.goingmerry.service.ILoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = Constants.API_PREFIX + "/login", consumes = {
		MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
@Api(tags = { "登录接口", "LoginController" })
public class LoginController {

	@Autowired
	ILoginService loginService;

	@PutMapping(value = "/{userId}/changepassword")
	@ApiOperation(value = "更新用户密码")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户更新成功", response = User.class) })
	User updateUserPassword(@ApiParam(value = "用户id", required = true) @PathParam("userId") String userId,
			@ApiParam(value = "用户", required = true) User user) throws GoingMerryException {
		return loginService.updateUserPassword(userId, user);
	}

	@PostMapping
	@ApiOperation(value = "用户登录")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户登录成功", response = User.class) })
	User login(@ApiParam(value = "用户", required = true) User user) throws GoingMerryException {
		return loginService.login(user);
	}
}
