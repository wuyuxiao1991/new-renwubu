package com.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.persistence.entity.MilitaryStrengthGuarantee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author wuyuxiao
 */
@Mapper
public interface MilitaryStrengthGuaranteeMapper extends BaseMapper<MilitaryStrengthGuarantee> {


    List<MilitaryStrengthGuarantee> pageQuery(@Param("searchKey") String searchKey,
                                           @Param("registrationTask") String registrationTask,
                                           @Param("identity") String identity,
                                           @Param("offset") int offset, @Param("pageSize") int pageSize);

    int queryTotalCount(@Param("searchKey") String searchKey,
                        @Param("registrationTask") String registrationTask,
                        @Param("identity") String identity);

    int updateDeleteStatus(String id);

}