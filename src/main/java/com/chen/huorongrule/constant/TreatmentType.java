package com.chen.huorongrule.constant;

/**
 * 处理方式。
 *
 * @author chen
 */
public enum TreatmentType {
    /**
     * 询问。
     */
    ASK(1),
    /**
     * 自动拒绝。
     */
    REJECT(3);

    private final int type;

    TreatmentType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
