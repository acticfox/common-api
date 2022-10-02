package com.github.acticfox.common.api.param;

import java.io.Serializable;

import jakarta.validation.constraints.Min;

/**
 * 主要用于分页，提取数据offset-length 类Limit.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong.kfy 2013-8-16 上午11:18:29
 */
public class Limit implements Serializable {

    private static final long serialVersionUID = -3709924425505549153L;

    @Min(value = 0)
    private int offset = 0;

    @Min(value = 1)
    private int length = 0;

    public Limit() {}

    public Limit(int length) {
        this.length = length;
    }

    public Limit(int offset, int length) {
        this.offset = offset;
        this.length = length;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "limit [" + offset + ", " + length + "]";
    }

    public static final Limit create(int offset, int length) {
        return new Limit(offset, length);
    }

    public static final Limit create(int length) {
        return new Limit(length);
    }

}
