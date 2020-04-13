package com.sdu.software.goingmerry.service.impl;

import com.sdu.software.goingmerry.dao.CommentMapper;
import com.sdu.software.goingmerry.model.Comment;
import com.sdu.software.goingmerry.service.CommentService;
import com.sdu.software.goingmerry.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author Liyp
 * @data 2020/04/13.
 */
@Service
@Transactional
public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {
    @Resource
    private CommentMapper gkdCommentMapper;

}
