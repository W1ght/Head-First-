package com.wight.proxy.gumballremote;

import java.io.Serializable;

/**
 * @author wight
 * @date 2021/11/21
 * @apiNote
 */
public interface State extends Serializable {
    /**
     * 投币
     */
    void insertQuarter();
    /**
     * 退币
     */
    void ejectQuarter();
    /**
     * 拨杆
     */
    void turnCrank();
    /**
     * 分配
     */
    void dispense();
}
