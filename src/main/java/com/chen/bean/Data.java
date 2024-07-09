package com.chen.bean;

import com.chen.constant.Constant;

import java.util.List;

/**
 * 规则内容，一条规则包含多条策略。
 *
 * @author chen
 */
public class Data {
    /**
     * 发起程序。
     */
    private String procname;
    /**
     * 规则id，数字。
     */
    private int id;
    /**
     * 规则名称。
     */
    private String name;
    /**
     * 发起程序命令行。
     */
    private String cmdline = Constant.ANY;
    /**
     * 发起程序父进程。
     */
    private String pProcname = Constant.ANY;
    /**
     * 父进程命令行。
     */
    private String pCmdline = Constant.ANY;
    /**
     * 保护策略。
     */
    private List<Policy> policies;
    /**
     * 未知。
     */
    private int power;
    /**
     * 处理方式。
     */
    private int treatment;

    public String getProcname() {
        return procname;
    }

    public void setProcname(String procname) {
        this.procname = procname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmdline() {
        return cmdline;
    }

    public void setCmdline(String cmdline) {
        this.cmdline = cmdline;
    }

    public String getpProcname() {
        return pProcname;
    }

    public void setpProcname(String pProcname) {
        this.pProcname = pProcname;
    }

    public String getpCmdline() {
        return pCmdline;
    }

    public void setpCmdline(String pCmdline) {
        this.pCmdline = pCmdline;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTreatment() {
        return treatment;
    }

    public void setTreatment(int treatment) {
        this.treatment = treatment;
    }
}
