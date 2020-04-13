package com.sdu.software.goingmerry.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="User")
@Data
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
}