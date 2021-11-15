package com.wight.adapter.duck;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
