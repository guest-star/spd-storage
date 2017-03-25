package com.spd.storage.dal.dao;

import com.spd.storage.dal.domain.SpdPurchaseOrderDO;
import com.spd.storage.dal.domain.SpdPurchaseOrderDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpdPurchaseOrderDOMapper {
    int deleteByExample(SpdPurchaseOrderDOExample example);

    int insert(SpdPurchaseOrderDO record);

    int insertSelective(SpdPurchaseOrderDO record);

    List<SpdPurchaseOrderDO> selectByExample(SpdPurchaseOrderDOExample example);

    int updateByExampleSelective(@Param("record") SpdPurchaseOrderDO record, @Param("example") SpdPurchaseOrderDOExample example);

    int updateByExample(@Param("record") SpdPurchaseOrderDO record, @Param("example") SpdPurchaseOrderDOExample example);
}