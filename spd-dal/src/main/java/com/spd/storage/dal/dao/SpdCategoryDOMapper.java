package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdCategoryDO;
import com.spd.storage.dal.domain.SpdCategoryDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdCategoryDOMapper {
    int deleteByExample(SpdCategoryDOExample example);

    int insert(SpdCategoryDO record);

    int insertSelective(SpdCategoryDO record);

    List<SpdCategoryDO> selectByExample(SpdCategoryDOExample example);

    int updateByExampleSelective(@Param("record") SpdCategoryDO record, @Param("example") SpdCategoryDOExample example);

    int updateByExample(@Param("record") SpdCategoryDO record, @Param("example") SpdCategoryDOExample example);
}