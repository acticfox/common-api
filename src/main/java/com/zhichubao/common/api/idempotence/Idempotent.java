package com.zhichubao.common.api.idempotence;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author fanyong.kfy 2018-06-08 14:18:31
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Idempotent {

    /**
     * 一级存储幂等有效期,时间单位天，如果小于等于0表示被注解的方法没有自定义存储时间
     */
    int firstLevelExpireDate() default 0;

    /**
     * 二级存储幂等有效期,时间单位天，如果小于等于0表示被注解的方法没有自定义存储时间
     */
    int secondLevelExpireDate() default 0;

    /**
     * 幂等key定义,支持Spel表达式
     */
    String spelKey() default "";
}
