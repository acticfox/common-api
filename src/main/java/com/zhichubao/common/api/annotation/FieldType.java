package com.zhichubao.common.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.zhichubao.common.api.enums.FieldTypeEnum;

/**
 * 类 FieldType.java 的实现描述：字段类型注解，用来声明这个字段是哪种类型
 *
 * @author fanyong.kfy 14-5-19 上午10:27
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldType {
	FieldTypeEnum value();
}
