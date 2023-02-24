package com.persistence.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.persistence.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wuyuxiao
 */
@Mapper
public
interface UserInfoMapper extends BaseMapper<UserInfo> {

    UserInfo findByName(String name);

}