package com.sdu.software.goingmerry.service.impl;

import com.sdu.software.goingmerry.dao.ArticleMapper;
import com.sdu.software.goingmerry.model.Article;
import com.sdu.software.goingmerry.service.ArticleService;
import com.sdu.software.goingmerry.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author Liyp
 * @data 2020/04/10.
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper gkdArticleMapper;

}
