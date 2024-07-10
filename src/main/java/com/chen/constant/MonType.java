package com.chen.constant;

/**
 * 规则类型。
 */
public enum MonType {
    /**
     * 执行规则。
     */
    EXEC(0),
    /**
     * 文件规则。
     */
    FILE(1),
    /**
     * 注册表规则。
     */
    REGISTER(2);
    /**
     * 规则类型。
     */
    private final int type;

    MonType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
