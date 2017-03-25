package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdShippDO;
import com.spd.storage.dal.domain.SpdShippDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdShippDOMapper {
    int deleteByExample(SpdShippDOExample example);

    int insert(SpdShippDO record);

    int insertSelective(SpdShippDO record);

    List<SpdShippDO> selectByExample(SpdShippDOExample example);

    int updateByExampleSelective(@Param("record") SpdShippDO record, @Param("example") SpdShippDOExample example);

    int updateByExample(@Param("record") SpdShippDO record, @Param("example") SpdShippDOExample example);
}