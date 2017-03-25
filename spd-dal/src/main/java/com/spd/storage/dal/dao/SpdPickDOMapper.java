package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdPickDO;
import com.spd.storage.dal.domain.SpdPickDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdPickDOMapper {
    int deleteByExample(SpdPickDOExample example);

    int insert(SpdPickDO record);

    int insertSelective(SpdPickDO record);

    List<SpdPickDO> selectByExample(SpdPickDOExample example);

    int updateByExampleSelective(@Param("record") SpdPickDO record, @Param("example") SpdPickDOExample example);

    int updateByExample(@Param("record") SpdPickDO record, @Param("example") SpdPickDOExample example);
}