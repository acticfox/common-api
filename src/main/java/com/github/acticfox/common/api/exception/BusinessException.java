/*
 * Copyright 2013 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 *
 */
package com.github.acticfox.common.api.exception;

import com.github.acticfox.common.api.enums.ErrCodeEnum;

/**
 * 类BusinessException.java的实现描述：
 * 
 * <pre>
 * 业务异常定义，一般用于非可重试幂等错误码异常定义
 * </pre>
 * 
 * @author fanyong.kfy 2015年4月16日 下午4:04:41
 */
public class BusinessException extends AbstractBizException {

	private static final long serialVersionUID = 68587172887123253L;

	@Deprecated
	public BusinessException(String errMsg) {
		super(errMsg);
	}

	public BusinessException(ErrCodeEnum errCodeEnum) {
		super(errCodeEnum.getErrMsg());
		this.errCode = errCodeEnum.getErrCode();
	}

	public BusinessException(ErrCodeEnum errCodeEnum, Object... errorArgs) {
		super(errCodeEnum.getErrMsg());
		this.errCode = errCodeEnum.getErrCode();
		this.errorArgs = errorArgs;
	}

	public BusinessException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}

	public BusinessException(String errCode, String errMsg, Object[] errorArgs) {
		super(errMsg);
		this.errCode = errCode;
		super.errorArgs = errorArgs;
	}

	public BusinessException(String errCode, String medusaCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
		this.medusaCode = medusaCode;
	}

	public BusinessException(String errCode, String medusaCode, String errMsg, Object[] errorArgs) {
		super(errMsg);
		this.errCode = errCode;
		this.medusaCode = medusaCode;
		this.errorArgs = errorArgs;
	}

}
