package com.wight.combining.composite;

/**
 * @author wight
 * @date 2021/11/22
 * @apiNote
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
