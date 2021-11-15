package com.wight.adapter.duck;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
