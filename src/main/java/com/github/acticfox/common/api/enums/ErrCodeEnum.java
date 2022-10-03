/*
 * Copyright 2015 github.com All right reserved. This software is the
 * confidential and proprietary information of github.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with github.com .
 */
package com.github.acticfox.common.api.enums;

/**
 * 类ErrCodeEnum.java的实现描述：
 * 
 * <pre>
 * errcode接口定义
 * </pre>
 * 
 * @author fanyong.kfy 2015年4月16日 下午4:02:12
 */
public interface ErrCodeEnum {

    /**
     * 获取错误信息
     * 
     * @return
     */
    public String getErrMsg();

    /**
     * 获取错误码
     * 
     * @return
     */
    public String getErrCode();

}
