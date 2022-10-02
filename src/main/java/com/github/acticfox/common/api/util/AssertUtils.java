/*
 * Copyright 2016 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.acticfox.common.api.util;

import com.github.acticfox.common.api.enums.ErrCodeEnum;
import com.github.acticfox.common.api.enums.ExceptionCodeEnum;
import com.github.acticfox.common.api.exception.BusinessException;
import com.github.acticfox.common.api.exception.RetriableException;

/**
 * 类AssertUtils.java的实现描述：
 * 
 * <pre>
 * 断言工具类处理，避免频繁写 <code>if(xxx) throw new BusinessException</code>
 * 
 * <pre>
 * 
 * @author fanyong.kfy 2016年11月8日 下午3:02:53
 */
public class AssertUtils {

	private static void processException(ErrCodeEnum errCode, Object... args) {
		if (errCode instanceof ExceptionCodeEnum) {
			ExceptionCodeEnum exceptionCode = (ExceptionCodeEnum) errCode;
			if (exceptionCode.isRetriable()) {
				throw new RetriableException(exceptionCode, args);
			}
		}
		throw new BusinessException(errCode, args);
	}

	private static void processException(ErrCodeEnum errCode) {
		if (errCode instanceof ExceptionCodeEnum) {
			ExceptionCodeEnum exceptionCode = (ExceptionCodeEnum) errCode;
			if (exceptionCode.isRetriable()) {
				throw new RetriableException(exceptionCode);
			}
		}
		throw new BusinessException(errCode);
	}

	public static void assertTrue(boolean condition, String errCode, String errMsg) {
		if (!condition) {
			throw new BusinessException(errCode, errMsg);
		}
	}

	public static void assertTrue(boolean condition, ErrCodeEnum errCode) {
		if (!condition) {
			processException(errCode);
		}
	}

	/**
	 * 支持ErrCodeEnum错误消息动态参数
	 * 
	 * @param condition
	 * @param errCode
	 * @param args
	 */
	public static void assertTrue(boolean condition, ErrCodeEnum errCode, Object... args) {
		if (!condition) {
			processException(errCode, args);
		}
	}

	public static void assertFalse(boolean condition, ErrCodeEnum errCode) {
		if (condition) {
			processException(errCode);
		}
	}

	/**
	 * 支持ErrCodeEnum错误消息动态参数
	 * 
	 * @param condition
	 * @param errCode
	 * @param args
	 */
	public static void assertFalse(boolean condition, ErrCodeEnum errCode, Object... args) {
		if (condition) {
			processException(errCode, args);
		}
	}

}
