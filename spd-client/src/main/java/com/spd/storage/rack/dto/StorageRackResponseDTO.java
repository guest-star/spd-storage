package com.spd.storage.rack.dto;

import com.spd.storage.common.dto.BaseResponseDTO;
import com.spd.storage.common.dto.PageInfo;

/**
 * Created by luoyongchang on 2017/3/17.
 */
public class StorageRackResponseDTO extends BaseResponseDTO {

    private static final long serialVersionUID = -6526087344804091431L;


    private PageInfo<StorageRackDetailDTO> pageInfo;
}
