/*
 * Copyright 2018 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.common.api.enums;

import java.io.Serializable;

/**
 * 类FieldType.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong.kfy 2018年11月16日 下午1:36:31
 */
public enum SecurityFieldType implements Serializable {
    // 手机
    MOBILE,
    // 邮箱
    EMAIL,
    // 证件号
    IDNO,
    // 姓名
    REALNAME,
    // 电话
    TELEPHONE,
    // 银行卡
    BANKCARD,
    // 其他
    NONE;

}
