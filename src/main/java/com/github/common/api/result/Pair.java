package com.github.common.api.result;

import java.io.Serializable;

public class Pair<A, B> implements Serializable {

    private static final long serialVersionUID = 1L;

    public  A            first;
    public  B            second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
