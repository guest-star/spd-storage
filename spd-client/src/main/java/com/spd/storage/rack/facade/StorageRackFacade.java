package com.spd.storage.rack.facade;

import com.spd.storage.rack.dto.StorageRackRequestDTO;
import com.spd.storage.rack.dto.StorageRackResponseDTO;

/**
 * Created by luoyongchang on 2017/3/17.
 */
public interface StorageRackFacade {

    /**
     * 货架查询
     * @param request
     * @return
     */
    StorageRackResponseDTO query(StorageRackRequestDTO request);

}
