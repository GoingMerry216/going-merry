package com.sdu.software.goingmerry.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="Article")
@Data
@Table(name = "gkd_article")
public class Article {
    @Id
    @Column(name = "article_id")
    @ApiModelProperty(value="")
    private Integer articleId;

    @Column(name = "user_id")
    @ApiModelProperty(value="")
    private Integer userId;

    /**
     * 文章摘要
     */
    @ApiModelProperty(value="文章摘要")
    private String summary;

    /**
     * 文章内容
     */
    @ApiModelProperty(value="文章内容")
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