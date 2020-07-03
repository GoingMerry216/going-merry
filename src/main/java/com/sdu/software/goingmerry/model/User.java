package com.sdu.software.goingmerry.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;

@ApiModel(value="User")
@Table(name = "gkd_user")
public class User {
    @Id
    @Column(name = "user_id")
    @ApiModelProperty(value="")
    private Integer userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    @ApiModelProperty(value="用户名")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 用户token
     */
    @ApiModelProperty(value="用户token")
    private String token;

    /**
     * 是否是合法用户
     */
    @Column(name = "is_valid")
    @ApiModelProperty(value="是否是合法用户")
    private Integer isValid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    @ApiModelProperty(value="创建用户")
    private String createUser;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="修改时间")
    private Date updateTime;

    /**
     * 修改用户
     */
    @Column(name = "update_user")
    @ApiModelProperty(value="修改用户")
    private Date updateUser;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
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

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Date updateUser) {
		this.updateUser = updateUser;
	}
}