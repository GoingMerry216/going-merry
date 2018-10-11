package com.sdu.software.goingmerry.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sdu.software.goingmerry.common.Constants;
import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.common.ResultList;
import com.sdu.software.goingmerry.entity.User;
import com.sdu.software.goingmerry.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = Constants.API_PREFIX + "/users", consumes = {
		MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
@Api(tags = { "用户接口", "UserController" })
public class UserController {

	@Autowired
	IUserService userService;

	@RequestMapping(method = RequestMethod.GET, consumes = { MediaType.ALL_VALUE })
	@ApiOperation(value = "查询用户列表")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户列表查询成功", response = ResultList.class) })
	ResultList<User> listUser(@ApiParam(value = "页数", required = false) @RequestParam("page") int page,
			@ApiParam(value = "每页显示的数据条数", required = false) @RequestParam("size") int size)
			throws GoingMerryException {
		return userService.listUser(page, size);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userId}", consumes = { MediaType.ALL_VALUE })
	@ApiOperation(value = "查询用户详情")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户详情查询成功", response = User.class) })
	User getUser(@ApiParam(value = "用户id", required = true)  @PathVariable("userId") String userId)
			throws GoingMerryException {
		return userService.getUser(userId);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "创建用户")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户创建成功", response = User.class) })
	User createUser(@ApiParam(value = "用户", required = true) @RequestBody User user) throws GoingMerryException {
		return userService.createUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
	@ApiOperation(value = "更新用户")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户更新成功", response = User.class) })
	User updateUser(@ApiParam(value = "用户id", required = true)  @PathVariable("userId") String userId,
			@ApiParam(value = "用户", required = true) @RequestBody User user) throws GoingMerryException {
		return userService.updateUser(userId, user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{userId}", consumes = { MediaType.ALL_VALUE })
	@ApiOperation(value = "删除用户")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户删除成功", response = User.class) })
	User deleteUser(@ApiParam(value = "用户id", required = true) @PathVariable("userId") String userId,
			@ApiParam(value = "用户", required = true) @RequestBody User user) throws GoingMerryException {
		return userService.deleteUser(userId, user);
	}
}
