/*
 * Copyright 2013 zhichubao.com All right reserved. This software is the
 * confidential and proprietary information of zhichubao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with zhichubao.com .
 */
package com.github.common.api.result;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author fanyong.kfy
 */
public class PageResult<E> implements Serializable{
    
    private static final long serialVersionUID = 7578547633557805942L;

    /**
     * 每页默认记录数
     */
    private final static int DEFAULT_PAGE_SIZE = 20;
    
    /**
     * 每页最大条目
     */
    private final int MAX_PAGE_SIZE = 1000;
    
    
    /**
     * 总条目数
     */
    private int totalItemNum;
    /**
     * 当前页码
     */
    private int currentPageNum;
    /**
     * 每页大小
     */
    private int pageSize;
    
    /**
     * 总页数
     */
    private int totalPageNum;
    /**
     * 是否有上一页
     */
    private boolean prePage;
    /**
     * 是否有下一页
     */
    private boolean nextPage;
    /**
     * 是否超过结果集限制（记录总数、流量大小等）
     */
    private boolean resultLimit;
    /**
     * 绑定的实体list
     */
    private List<E> data;

    /**
     * 下一条记录主键
     */
    private E next;
    /**
     * 
     * @param totalItemNum 总条目数
     * @param currentPageNum 当前页号
     */
    public PageResult(int totalItemNum, int currentPageNum) {
        this(totalItemNum, currentPageNum, DEFAULT_PAGE_SIZE);
    }

    /**
     * 
     * @param totalItemNum 总条目数
     * @param currentPageNum 当前页号
     * @param pageSize 每页大小
     */
    public PageResult(int totalItemNum, int currentPageNum, int pageSize) {
        this.totalItemNum = totalItemNum;
        this.currentPageNum = currentPageNum;
        this.pageSize = pageSize > MAX_PAGE_SIZE ? MAX_PAGE_SIZE : pageSize;
        initTotalPage();
    }

    private void initTotalPage() {
        if (this.totalItemNum != 0 && this.pageSize != 0) {
            if (this.totalItemNum % this.pageSize == 0) {
                this.totalPageNum = this.totalItemNum / this.pageSize;
            } else {
                this.totalPageNum = this.totalItemNum / this.pageSize + 1;
            }
        }
        if (this.totalPageNum <= 1) {
            this.prePage = false;
            this.nextPage = false;
        } else {
            this.prePage = true;
            this.nextPage =true;
            if (this.currentPageNum <= 1) {
                this.prePage = false;
            }
            if (this.currentPageNum == this.totalPageNum) {// 最后一页
                this.nextPage = false;
            }
        }
        this.resultLimit = false;
    }

    /**
     * 绑定list
     * @param data 
     */
    public void bindData(List<E> data) {
        this.data = data;
    }

    public int getStartPosition() {
        return (this.currentPageNum - 1) * this.pageSize;
    }

    public int getCurrentPageNum() {
        return currentPageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalItemNum() {
        return totalItemNum;
    }

    public int getTotalPageNum() {
	if(totalPageNum == 0) return 1;
        return totalPageNum;
    }

    public boolean isPrepage() {
        return this.prePage;
    }

    public boolean isNextpage() {
        return this.nextPage;
    }

    public List<E> getData() {
        return data;
    }

    public boolean isResultLimit() {
        return resultLimit;
    }

    public void setResultLimit(boolean resultLimit) {
        this.resultLimit = resultLimit;
    }

    public E getNext() {
        return next;
    }

    public void setNext(E next) {
        this.next = next;
    }
}
