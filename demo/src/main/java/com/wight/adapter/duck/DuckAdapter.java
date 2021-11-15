package com.wight.adapter.duck;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class DuckAdapter implements Turkey{

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            if (i == 5 - 1) {
                duck.fly();
            }
        }
    }
}
