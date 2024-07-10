package com.chen.constant;

/**
 * 数字型布尔值。
 *
 * @author chen
 */
public enum BoolNum {
    TRUE(1), FALSE(0);
    private final int type;

    BoolNum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
