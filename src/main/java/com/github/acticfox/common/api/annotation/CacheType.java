/*
 * Copyright 2015 github.com All right reserved. This software is the
 * confidential and proprietary information of github.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with github.com .
 */
package com.github.acticfox.common.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.github.acticfox.common.api.enums.CacheTypeEnum;

/**
 * 类 Cache.java的实现描述：表是否需要启用Cache注解
 *
 * @author fanyong.kfy 2015-04-16 13:52
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheType {
	CacheTypeEnum value();
}
