package com.spd.storage.common.dto;

import java.io.Serializable;

/**
 * Created by luoyongchang on 2016/12/30.
 */
public class BaseResponseDTO implements Serializable {

    private static final long serialVersionUID = -4092020191919798854L;

    private String responseCode;

    private String responseMsg;

    private boolean success;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
