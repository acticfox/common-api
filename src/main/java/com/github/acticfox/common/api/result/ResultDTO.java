/*
 * Copyright 2014 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.acticfox.common.api.result;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

/**
 * 类ResultDTO.java的实现描述：
 * 
 * <pre>
 * RPC业务层返回的调用结果
 * </pre>
 * 
 * @author fanyong.kfy 2014-8-4 上午10:11:52
 */
public class ResultDTO<T extends Serializable> implements Serializable {

	private static final long serialVersionUID = 3682481175041925854L;

	private static final String DEFAULT_SUC_CODE = "200";

	private static final String DEFAULT_ERR_CODE = "500";

	private String message;

	private String code;

	private boolean success;

	private T data;

	/**
	 * 是否允许重试，默认不可以重试，幂等接口可重试
	 */
	private boolean retriable;

	/**
	 * 返回错误参数
	 */
	private Object[] errorArgs;

	/**
	 * default Constructor
	 */
	public ResultDTO() {

	}

	/**
	 * Constructor
	 * 
	 * @param message
	 * @param success
	 */
	public ResultDTO(String code, String message, T obj) {
		super();
		this.code = code;
		this.message = message;
		this.success = false;
		this.data = obj;
	}

	public ResultDTO(T obj) {
		this.success = true;
		this.data = obj;
	}

	public static <T extends Serializable> ResultDTO<T> buildSuccessResult() {
		return new ResultDTO<T>(null);
	}

	public static <T extends Serializable> ResultDTO<T> buildSuccessResult(T obj) {
		return new ResultDTO<T>(obj);
	}

	public static <T extends Serializable> ResultDTO<T> buildFailedResult(String errCode, String errMsg, T obj) {
		return new ResultDTO<T>(errCode, errMsg, obj);
	}

	public static <T extends Serializable> ResultDTO<T> buildFailedResult(String errCode, String errMsg) {
		return new ResultDTO<T>(errCode, errMsg, null);
	}

	public static <T extends Serializable> ResultDTO<T> buildFailedResult(String errMsg) {
		return new ResultDTO<T>(DEFAULT_ERR_CODE, errMsg, null);
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isRetriable() {
		return retriable;
	}

	public void setRetriable(boolean retriable) {
		this.retriable = retriable;
	}

	public Object[] getErrorArgs() {
		return errorArgs;
	}

	public void setErrorArgs(Object[] errorArgs) {
		this.errorArgs = errorArgs;
	}

	public String toJsonString() {

		return JSON.toJSONString(this);
	}

}
