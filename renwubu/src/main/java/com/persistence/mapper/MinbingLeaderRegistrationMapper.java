package com.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.persistence.entity.MinbingLeaderRegistration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author wuyuxiao
 */
@Mapper
public interface MinbingLeaderRegistrationMapper extends BaseMapper<MinbingLeaderRegistration> {


    int queryTotalCount(@Param("searchKey") String searchKey,
                        @Param("name") String name,
                        @Param("position") String position,
                        @Param("politicalStatus") String politicalStatus,
                        @Param("educationLevel") String educationLevel,
                        @Param("phone") String phone,
                        @Param("identity") String identity);


    List<MinbingLeaderRegistration> pageQuery(@Param("searchKey") String searchKey,
                                              @Param("name") String name,
                                              @Param("position") String position,
                                              @Param("politicalStatus") String politicalStatus,
                                              @Param("educationLevel") String educationLevel,
                                              @Param("phone") String phone,
                                              @Param("identity") String identity,
                                              @Param("offset") int offset, @Param("pageSize") int pageSize);


    int updateDeleteStatus(String id);

}