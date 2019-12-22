package com.java416.gmall.usermanage.service.impl;

import com.java416.gmall.bean.UmsMember;
import com.java416.gmall.service.UserService;
import com.java416.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UmsMember> findAll() {
        return userInfoMapper.selectAll();
    }
}
