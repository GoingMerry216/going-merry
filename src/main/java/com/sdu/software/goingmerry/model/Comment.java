package com.sdu.software.goingmerry.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;

@ApiModel(value="Comment")
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

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Integer getCommentParentId() {
		return commentParentId;
	}

	public void setCommentParentId(Integer commentParentId) {
		this.commentParentId = commentParentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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