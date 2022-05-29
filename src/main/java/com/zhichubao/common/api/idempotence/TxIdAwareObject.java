package com.zhichubao.common.api.idempotence;

import com.zhichubao.common.api.BaseObject;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author fanyong.kfy 2018-11-01 14:20:48
 */
public class TxIdAwareObject<T> extends BaseObject {

    private String txId;

    private T value;

    @IdempotentTxIdGetter
    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
