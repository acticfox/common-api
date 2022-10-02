/*
 * Copyright 2018 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.acticfox.common.api.exception;

/**
 * 类AbstractException.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong.kfy 2018年7月16日 下午5:52:28
 */
public abstract class AbstractBizException extends RuntimeException {

    /**
     * 异常代码
     */
    protected String errCode;

    /**
     * 美杜莎KEY
     */
    protected String medusaCode;

    /**
     * 错误消息替换字符串数组
     */
    protected Object[] errorArgs = null;

    /**
     * throwable
     */
    protected Throwable throwable;

    public AbstractBizException(String errMsg) {
        super(errMsg);
    }

    public Throwable getException() {
        throwable = super.getCause();
        return throwable;
    }

    public String getErrCode() {
        return errCode;
    }

    /**
     * @return the errorArgs
     */
    public Object[] getErrorArgs() {
        return errorArgs;
    }

    /**
     * @return the medusaCode
     */
    public String getMedusaCode() {
        return medusaCode;
    }
}
