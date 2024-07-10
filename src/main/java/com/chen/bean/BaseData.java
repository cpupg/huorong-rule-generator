package com.chen.bean;

import com.chen.constant.ActionType;
import com.chen.constant.BoolNum;
import com.chen.constant.MonType;
import com.chen.constant.TreatmentType;

/**
 * 基础数据，可以由命令行输入，也可以从模板文件读取，用来生成规则。
 *
 * @author chen
 */
public class BaseData {
    /**
     * 发起程序。
     */
    private String[] programNames;
    /**
     * 要保护的资源全路径。
     */
    private String[] resourcePaths;

    /**
     * 规则名称，一个进程对应一个规则，长度必须和programNames相同。
     */
    private String[] ruleNames;
    /**
     * 处理方式。
     */
    private TreatmentType treatment;
    /**
     * 是否启用。
     */
    private BoolNum power = BoolNum.TRUE;

    /**
     * 资源类型。
     */
    private MonType monType;
    /**
     * 操作类型。
     */
    private ActionType actionType;

    public String[] getProgramNames() {
        return programNames;
    }

    public void setProgramNames(String[] programNames) {
        this.programNames = programNames;
    }

    public String[] getResourcePaths() {
        return resourcePaths;
    }

    public void setResourcePaths(String[] resourcePaths) {
        this.resourcePaths = resourcePaths;
    }

    public String[] getRuleNames() {
        return ruleNames;
    }

    public void setRuleNames(String[] ruleNames) {
        this.ruleNames = ruleNames;
    }

    public MonType getMonType() {
        return monType;
    }

    public void setMonType(MonType monType) {
        this.monType = monType;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public TreatmentType getTreatment() {
        return treatment;
    }

    public void setTreatment(TreatmentType treatment) {
        this.treatment = treatment;
    }

    public BoolNum getPower() {
        return power;
    }

    public void setPower(BoolNum power) {
        this.power = power;
    }
}
