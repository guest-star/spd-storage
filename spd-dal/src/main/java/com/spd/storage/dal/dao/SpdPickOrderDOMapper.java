package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdPickOrderDO;
import com.spd.storage.dal.domain.SpdPickOrderDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdPickOrderDOMapper {
    int deleteByExample(SpdPickOrderDOExample example);

    int insert(SpdPickOrderDO record);

    int insertSelective(SpdPickOrderDO record);

    List<SpdPickOrderDO> selectByExample(SpdPickOrderDOExample example);

    int updateByExampleSelective(@Param("record") SpdPickOrderDO record, @Param("example") SpdPickOrderDOExample example);

    int updateByExample(@Param("record") SpdPickOrderDO record, @Param("example") SpdPickOrderDOExample example);
}