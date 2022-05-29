/*
 * Copyright 2015 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.common.api.enums;

/**
 * 类StringEnum.java的实现描述：
 * 
 * <pre>
 * String code枚举类型基类
 * </pre>
 * 
 * @author fanyong.kfy 2015年4月12日 下午4:47:06
 */
public interface StringEnum<E extends Enum<E>> {

    /**
     * 枚举code
     * 
     * @return
     */
    public String getCode();

}
