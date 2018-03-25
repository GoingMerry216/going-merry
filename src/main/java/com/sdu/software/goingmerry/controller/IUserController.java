package com.sdu.software.goingmerry.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sdu.software.goingmerry.common.Constants;
import com.sdu.software.goingmerry.common.GoingMerryException;
import com.sdu.software.goingmerry.common.ResultList;

import entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path(Constants.API_PREFIX + "/users")
@Api(tags = { "应用接口", "IAppApi" })
public interface IUserController {

	@GET
	@ApiOperation(value = "查询用户列表")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户列表查询成功", response = ResultList.class) })
	ResultList<User> listUser(
			@ApiParam(value = "页数", required = false) @QueryParam("page") int page,
			@ApiParam(value = "每页显示的数据条数", required = false) @QueryParam("size") int size) throws GoingMerryException;

	@GET
	@Path("/{userId}")
	@ApiOperation(value = "查询用户详情")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户详情查询成功", response = User.class) })
	User getUser(
			@ApiParam(value = "用户id", required = true) @PathParam("userId") String userId) throws GoingMerryException;

	@POST
	@ApiOperation(value = "创建用户")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户创建成功", response = User.class) })
	User createUser(
			@ApiParam(value = "用户", required = true) User user) throws GoingMerryException;

	@PUT
	@Path("/{userId}")
	@ApiOperation(value = "更新用户")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户更新成功", response = User.class) })
	User updateUser(
			@ApiParam(value = "用户id", required = true) @PathParam("userId") String userId,
			@ApiParam(value = "用户", required = true) User user) throws GoingMerryException;
	
	@PUT
	@Path("/{userId}/changepassword")
	@ApiOperation(value = "更新用户")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户更新成功", response = User.class) })
	User updateUserPassword(
			@ApiParam(value = "用户id", required = true) @PathParam("userId") String userId,
			@ApiParam(value = "用户", required = true) User user) throws GoingMerryException;

	@DELETE
	@Path("/{userId}")
	@ApiOperation(value = "删除用户")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户删除成功", response = User.class) })
	User deleteUser(
			@ApiParam(value = "用户id", required = true) @PathParam("userId") String userId,
			@ApiParam(value = "用户", required = true) User user) throws GoingMerryException;

	@POST
	@ApiOperation(value = "用户登录")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "用户登录成功", response = User.class) })
	User login(
			@ApiParam(value = "用户", required = true) User user) throws GoingMerryException;

}
