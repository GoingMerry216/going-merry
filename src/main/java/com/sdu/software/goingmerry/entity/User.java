package com.sdu.software.goingmerry.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7954414137211665519L;

	@ApiModelProperty
	private String userId;

	@ApiModelProperty
	private String userName;

	@ApiModelProperty
	private String password;

	@ApiModelProperty
	private String token;

	@ApiModelProperty
	private String createTime;

	@ApiModelProperty
	private String createUser;

	@ApiModelProperty
	private String updateTime;

	@ApiModelProperty
	private String updateUser;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
