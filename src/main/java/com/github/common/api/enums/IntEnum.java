/*
 * Copyright 2015 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.common.api.enums;

/**
 * 类IntEnum.java的实现描述：
 * 
 * <pre>
 * int code枚举类型基类
 * </pre>
 * 
 * @author fanyong.kfy 2015年4月12日 下午4:48:00
 */
public interface IntEnum<E extends Enum<E>> {

    /**
     * 枚举code
     * 
     * @return
     */
    public int getCode();
}
