/*
 * Copyright 2013 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.common.api.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 类ResultList.java的实现描述： 　
 * 
 * <pre>
 * 通用查询接口的返回信息.  [count , recordList]
 * </pre>
 * 
 * @author fanyong 2013-8-20 下午5:04:42
 */
public final class ResultList<E extends Serializable> implements Iterable<E>, Serializable {

    private static final long serialVersionUID = 2789771757285593580L;

    private List<E>           list;

    private int               count            = 0;

    public ResultList() {
        this(new ArrayList<E>());
    }

    public ResultList(List<E> list) {
        this(0, list);
    }

    public ResultList(int count) {
        this(count, new ArrayList<E>());
    }

    public ResultList(int count, List<E> list) {
        if (list == null)
            list = Collections.emptyList();
        this.list = list;
        this.count = Math.max(count, list.size());
    }

    public void add(E ele) {
        list.add(ele);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public int getCount() {
        return Math.max(count, list.size());
    }

    public void setCount(int count) {
        this.count = count;
    }

}
