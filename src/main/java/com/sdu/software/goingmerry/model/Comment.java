package com.sdu.software.goingmerry.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="Comment")
@Data
@Table(name = "gkd_comment")
public class Comment {
    @Id
    @Column(name = "comment_id")
    @ApiModelProperty(value="")
    private Integer commentId;

    @Column(name = "user_id")
    @ApiModelProperty(value="")
    private Integer userId;

    /**
     * 评论目标
     */
    @ApiModelProperty(value="评论目标")
    private String target;

    /**
     * 评论父id
     */
    @Column(name = "comment_parent_id")
    @ApiModelProperty(value="评论父id")
    private Integer commentParentId;

    /**
     * 评论内容
     */
    @ApiModelProperty(value="评论内容")
    private String content;

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