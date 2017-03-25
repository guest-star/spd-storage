package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdShippOrderDO;
import com.spd.storage.dal.domain.SpdShippOrderDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdShippOrderDOMapper {
    int deleteByExample(SpdShippOrderDOExample example);

    int insert(SpdShippOrderDO record);

    int insertSelective(SpdShippOrderDO record);

    List<SpdShippOrderDO> selectByExample(SpdShippOrderDOExample example);

    int updateByExampleSelective(@Param("record") SpdShippOrderDO record, @Param("example") SpdShippOrderDOExample example);

    int updateByExample(@Param("record") SpdShippOrderDO record, @Param("example") SpdShippOrderDOExample example);
}