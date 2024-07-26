package com.chen.huorongrule.constant;

/**
 * 操作类型。
 *
 * <p>操作有五种，文件和注册表有四种，执行规则有一种，每个规则都对应一个数字，最小0最大16，执行规则只有16，文件规则和注册表规则是0-15。</p>
 *
 * <p>文件规则和注册表规则包含四个操作：删除，修改，读取，创建，这四个操作从左到右构成一个二进制数，允许是1，拒绝是0，因此最小是0，最大是
 * 15，具体规则如下：</p>
 *
 * <table>
 *     <thead><th>删除</th><th>修改</th><th>读取</th><th>创建</th><th>结果</th></thead>
 *     <tr><td>✖</td><td>✖</td><td>✖</td><td>✖</td><td>0</td></tr>
 *     <tr><td>✖</td><td>✖</td><td>✖</td><td>✔</td><td>1</td></tr>
 *     <tr><td>✖</td><td>✖</td><td>✔</td><td>✖</td><td>2</td></tr>
 *     <tr><td>✖</td><td>✖</td><td>✔</td><td>✔</td><td>3</td></tr>
 *     <tr><td>✖</td><td>✔</td><td>✖</td><td>✖</td><td>4</td></tr>
 *     <tr><td>✖</td><td>✔</td><td>✖</td><td>✔</td><td>5</td></tr>
 *     <tr><td>✖</td><td>✔</td><td>✖</td><td>✔</td><td>6</td></tr>
 *     <tr><td>✖</td><td>✔</td><td>✔</td><td>✔</td><td>7</td></tr>
 *     <tr><td>✔</td><td>✖</td><td>✖</td><td>✖</td><td>8</td></tr>
 *     <tr><td>✔</td><td>✖</td><td>✖</td><td>✔</td><td>9</td></tr>
 *     <tr><td>✔</td><td>✖</td><td>✔</td><td>✖</td><td>10</td></tr>
 *     <tr><td>✔</td><td>✖</td><td>✔</td><td>✔</td><td>11</td></tr>
 *     <tr><td>✔</td><td>✔</td><td>✖</td><td>✖</td><td>12</td></tr>
 *     <tr><td>✔</td><td>✔</td><td>✖</td><td>✔</td><td>13</td></tr>
 *     <tr><td>✔</td><td>✔</td><td>✔</td><td>✖</td><td>14</td></tr>
 *     <tr><td>✔</td><td>✔</td><td>✔</td><td>✔</td><td>15</td></tr>
 * </table>
 */
public enum ActionType {
    TYPE_0(0),
    TYPE_1(1),
    TYPE_2(2),
    TYPE_3(3),
    TYPE_4(4),
    TYPE_5(5),
    TYPE_6(6),
    TYPE_7(7),
    TYPE_8(8),
    TYPE_9(9),
    TYPE_10(10),
    TYPE_11(11),
    TYPE_12(12),
    TYPE_13(13),
    TYPE_14(14),
    TYPE_15(15),
    TYPE_16(16);
    /**
     * 类型。
     */
    private final int type;

    ActionType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
