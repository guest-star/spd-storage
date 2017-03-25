package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdContainerDO;
import com.spd.storage.dal.domain.SpdContainerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdContainerDOMapper {
    int deleteByExample(SpdContainerDOExample example);

    int insert(SpdContainerDO record);

    int insertSelective(SpdContainerDO record);

    List<SpdContainerDO> selectByExample(SpdContainerDOExample example);

    int updateByExampleSelective(@Param("record") SpdContainerDO record, @Param("example") SpdContainerDOExample example);

    int updateByExample(@Param("record") SpdContainerDO record, @Param("example") SpdContainerDOExample example);
}