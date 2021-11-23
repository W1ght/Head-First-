package com.wight.combining.observer;

/**
 * @author wight
 * @date 2021/11/23
 * @apiNote
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
