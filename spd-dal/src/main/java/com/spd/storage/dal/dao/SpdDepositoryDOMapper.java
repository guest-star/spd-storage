package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdDepositoryDO;
import com.spd.storage.dal.domain.SpdDepositoryDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdDepositoryDOMapper {
    int deleteByExample(SpdDepositoryDOExample example);

    int insert(SpdDepositoryDO record);

    int insertSelective(SpdDepositoryDO record);

    List<SpdDepositoryDO> selectByExample(SpdDepositoryDOExample example);

    int updateByExampleSelective(@Param("record") SpdDepositoryDO record, @Param("example") SpdDepositoryDOExample example);

    int updateByExample(@Param("record") SpdDepositoryDO record, @Param("example") SpdDepositoryDOExample example);
}