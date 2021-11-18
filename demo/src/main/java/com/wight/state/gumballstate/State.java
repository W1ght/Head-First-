package com.wight.state.gumballstate;

/**
 * @author wight
 * @date 2021/11/18
 * @apiNote
 */
public interface State {
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
