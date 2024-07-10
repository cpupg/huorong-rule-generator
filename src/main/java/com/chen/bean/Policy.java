package com.chen.bean;

import com.chen.constant.Constant;

/**
 * 规则策略。
 *
 * @author chen
 */
public class Policy {
    /**
     * 规则类型。
     */
    private int montype;
    private int actionType;
    private String resPath = Constant.ANY;
    private String resCmdline = Constant.ANY;

    public int getMontype() {
        return montype;
    }

    public void setMontype(int montype) {
        this.montype = montype;
    }

    public int getActionType() {
        return actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    public String getResPath() {
        return resPath;
    }

    public void setResPath(String resPath) {
        this.resPath = resPath;
    }

    public String getResCmdline() {
        return resCmdline;
    }

    public void setResCmdline(String resCmdline) {
        this.resCmdline = resCmdline;
    }
}
