package com.spd.storage.rack.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.spd.storage.rack.dto.StorageRackRequestDTO;
import com.spd.storage.rack.dto.StorageRackResponseDTO;
import com.spd.storage.rack.facade.StorageRackFacade;

/**
 * Created by luoyongchang on 2017/3/17.
 */
@Service(version = "1.0.0")
public class StorageRackServiceImpl implements StorageRackFacade {

    @Override
    public StorageRackResponseDTO query(StorageRackRequestDTO request) {
        return null;
    }
}
