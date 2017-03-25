package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdShelfDO;
import com.spd.storage.dal.domain.SpdShelfDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdShelfDOMapper {
    int deleteByExample(SpdShelfDOExample example);

    int insert(SpdShelfDO record);

    int insertSelective(SpdShelfDO record);

    List<SpdShelfDO> selectByExample(SpdShelfDOExample example);

    int updateByExampleSelective(@Param("record") SpdShelfDO record, @Param("example") SpdShelfDOExample example);

    int updateByExample(@Param("record") SpdShelfDO record, @Param("example") SpdShelfDOExample example);
}