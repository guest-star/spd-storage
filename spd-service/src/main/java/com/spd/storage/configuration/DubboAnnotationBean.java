package com.spd.storage.configuration;

import com.alibaba.dubbo.config.spring.AnnotationBean;

/**
 * Created by luoyongchang on 2017/2/15.
 */
public class DubboAnnotationBean extends AnnotationBean {

    private static final long serialVersionUID = 5192613149356163836L;

    @Override
    public void destroy() throws Exception {
        //doNothing
    }
}
