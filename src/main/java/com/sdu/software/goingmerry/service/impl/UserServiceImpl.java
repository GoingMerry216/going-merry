package com.sdu.software.goingmerry.service.impl;

import com.sdu.software.goingmerry.dao.UserMapper;
import com.sdu.software.goingmerry.model.User;
import com.sdu.software.goingmerry.service.UserService;
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
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper gkdUserMapper;

}
