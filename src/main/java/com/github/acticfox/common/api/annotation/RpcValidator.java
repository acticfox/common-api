/*
 * Copyright 2018 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.acticfox.common.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类IgnoreRpcLog.java的实现描述：TODO 类实现描述
 * 
 * <pre>
 * 添加注解用于标识是否进行参数校验，可用于接口以及方法上
 * </pre>
 * 
 * @author fanyong.kfy 2018年11月19日 下午4:06:19
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface RpcValidator {

	boolean validation() default true;
}
