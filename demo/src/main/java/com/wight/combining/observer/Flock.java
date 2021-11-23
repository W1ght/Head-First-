package com.wight.combining.observer;

import java.util.ArrayList;

/**
 * @author wight
 * @date 2021/11/22
 * @apiNote
 */
public class Flock implements Quackable {
    ArrayList<Quackable> ducks = new ArrayList<>();

    public void add(Quackable quaker) {
        ducks.add(quaker);
    }

    @Override
    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable duck : ducks) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}
