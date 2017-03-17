package com.spd.storage.common.dto;

import java.util.List;

/**
 * Created by luoyongchang on 2016/12/30.
 */
public class BaseCollectionResponseDTO<E> extends BaseResponseDTO {

    private static final long serialVersionUID = -3996609900328752850L;

    private List<E> items;
    private PageInfo<E> pageInfo;

    public List<E> getItems() {
        return items;
    }

    public void setItems(List<E> items) {
        this.items = items;
    }

    public PageInfo<E> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<E> pageInfo) {
        this.pageInfo = pageInfo;
    }
}
