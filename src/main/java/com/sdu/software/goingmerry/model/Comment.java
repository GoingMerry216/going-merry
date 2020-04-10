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

    /**
     * @return comment_id
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * @param commentId
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取评论目标
     *
     * @return target - 评论目标
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置评论目标
     *
     * @param target 评论目标
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * 获取评论父id
     *
     * @return comment_parent_id - 评论父id
     */
    public Integer getCommentParentId() {
        return commentParentId;
    }

    /**
     * 设置评论父id
     *
     * @param commentParentId 评论父id
     */
    public void setCommentParentId(Integer commentParentId) {
        this.commentParentId = commentParentId;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建用户
     *
     * @return create_user - 创建用户
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取修改用户
     *
     * @return update_user - 修改用户
     */
    public Date getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改用户
     *
     * @param updateUser 修改用户
     */
    public void setUpdateUser(Date updateUser) {
        this.updateUser = updateUser;
    }
}