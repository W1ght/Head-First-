package com.wight.combining.observer;

/**
 * @author wight
 * @date 2021/11/23
 * @apiNote
 */
public interface Observer {
    /**
     * update
     *
     * @param duck duck
     */
    void update(QuackObservable duck);
}
