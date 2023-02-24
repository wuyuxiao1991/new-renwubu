package com.service;


import com.persistence.entity.UserInfo;
import com.persistence.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuyuxiao
 */
@Service
public class UserService{
    @Resource
    private UserInfoMapper userInfoMapper;

    public UserInfo getUserInfoByName(String name){
        return  userInfoMapper.findByName(name);
    }
}
