package com.github.acticfox.common.api.idempotence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author fanyong.kfy 2018-06-08 14:52:39
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IdempotentTxIdGetter {}
