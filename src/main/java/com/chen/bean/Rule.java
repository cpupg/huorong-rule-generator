package com.chen.bean;

import java.util.List;

/**
 * 顶层元素，用来包裹规则，无实际含义。
 *
 * @author chen
 */
public class Rule {
    /**
     * 规则版本，默认6.0，暂不支持6.0以下版本。
     */
    private String ver = "6.0";
    /**
     * 标签，默认是hipsuser。
     */
    private String tag = "hipsuser";
    /**
     * 规则清单。
     */
    private List<Data> data;

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
