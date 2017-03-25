package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdDepartmentDO;
import com.spd.storage.dal.domain.SpdDepartmentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdDepartmentDOMapper {
    int deleteByExample(SpdDepartmentDOExample example);

    int insert(SpdDepartmentDO record);

    int insertSelective(SpdDepartmentDO record);

    List<SpdDepartmentDO> selectByExample(SpdDepartmentDOExample example);

    int updateByExampleSelective(@Param("record") SpdDepartmentDO record, @Param("example") SpdDepartmentDOExample example);

    int updateByExample(@Param("record") SpdDepartmentDO record, @Param("example") SpdDepartmentDOExample example);
}