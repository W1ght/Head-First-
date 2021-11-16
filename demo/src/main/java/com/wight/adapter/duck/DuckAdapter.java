package com.wight.adapter.duck;

import java.util.Random;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
