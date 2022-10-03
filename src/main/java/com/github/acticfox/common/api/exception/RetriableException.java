/*
 * Copyright 2018 github.com All right reserved. This software is the
 * confidential and proprietary information of github.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with github.com .
 */
package com.github.acticfox.common.api.exception;

import com.github.acticfox.common.api.enums.ExceptionCodeEnum;

/**
 * 类RetriableException.java的实现描述：
 * 
 * <pre>
 * 可重试异常，用于定义一些幂等可重试错误码异常
 * </pre>
 * 
 * @author fanyong.kfy 2018年7月16日 下午1:35:30
 */
public class RetriableException extends AbstractBizException {

	private static final long serialVersionUID = 68587172887123253L;

	public RetriableException(ExceptionCodeEnum errCodeEnum) {
		super(errCodeEnum.getErrMsg());
		this.errCode = errCodeEnum.getErrCode();
	}

	public RetriableException(ExceptionCodeEnum errCodeEnum, Object... errorArgs) {
		super(errCodeEnum.getErrMsg());
		this.errCode = errCodeEnum.getErrCode();
		this.errorArgs = errorArgs;
	}

	public RetriableException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}

	public RetriableException(String errCode, String errMsg, Object[] errorArgs) {
		super(errMsg);
		this.errCode = errCode;
		this.errorArgs = errorArgs;
	}

	public RetriableException(String errCode, String medusaCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
		this.medusaCode = medusaCode;
	}

	public RetriableException(String errCode, String medusaCode, String errMsg, Object[] errorArgs) {
		super(errMsg);
		this.errCode = errCode;
		this.medusaCode = medusaCode;
		this.errorArgs = errorArgs;
	}

}
