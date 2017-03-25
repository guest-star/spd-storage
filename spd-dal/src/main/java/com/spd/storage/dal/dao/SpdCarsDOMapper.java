package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdCarsDO;
import com.spd.storage.dal.domain.SpdCarsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdCarsDOMapper {
    int deleteByExample(SpdCarsDOExample example);

    int insert(SpdCarsDO record);

    int insertSelective(SpdCarsDO record);

    List<SpdCarsDO> selectByExample(SpdCarsDOExample example);

    int updateByExampleSelective(@Param("record") SpdCarsDO record, @Param("example") SpdCarsDOExample example);

    int updateByExample(@Param("record") SpdCarsDO record, @Param("example") SpdCarsDOExample example);
}
