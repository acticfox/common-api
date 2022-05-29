/*
 * Copyright 2018 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.common.api.annotation.rpclog;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.github.common.api.enums.SecurityFieldType;

/**
 * 类SecurityField.java的实现描述：
 * 
 * <pre>
 *  安全字段注解定义，日志打印环节忽略或者格式化
 * </pre>
 * 
 * @author fanyong.kfy 2018年11月16日 下午1:33:20
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface SecurityField {

	SecurityFieldType fieldType() default SecurityFieldType.NONE;

	// ignore表示是否打印，true表示忽略，false的话根据安全字段定义类型，如手机、邮箱、证件号会进行掩码处理，密码会进行md5处理
	boolean ignore() default false;
}
