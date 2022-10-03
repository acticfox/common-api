/*
 * Copyright 2018 github.com All right reserved. This software is the
 * confidential and proprietary information of github.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with github.com .
 */
package com.github.acticfox.common.api.enums;

/**
 * 类ExceptionCode.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong.kfy 2018年7月16日 上午11:57:28
 */
public interface ExceptionCodeEnum extends ErrCodeEnum {

    /**
     * 是否可重试
     * 
     * @return
     */
    public boolean isRetriable();

}
