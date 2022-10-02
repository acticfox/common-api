package com.github.acticfox.common.api.param;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * 用于排序使用
 * 类Order.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong.kfy 2013-8-16 上午11:19:30
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -7919046237869173480L;

    @NotNull
    private String item;
    private boolean desc = false;

    public Order() {}

    public Order(String item, boolean desc) {
        this.item = item;
        this.desc = desc;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isDesc() {
        return desc;
    }

    public void setDesc(boolean desc) {
        this.desc = desc;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
