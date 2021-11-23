package com.wight.combining.composite;

import java.util.ArrayList;

/**
 * @author wight
 * @date 2021/11/22
 * @apiNote
 */
public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quaker) {
        quackers.add(quaker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
        //Iterator<Quackable> iterator = quackers.iterator();
        //while (iterator.hasNext()) {
        //    Quackable quacker = iterator.next();
        //    quacker.quack();
        //}

    }
}
