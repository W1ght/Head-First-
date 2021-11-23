package com.wight.combining.composite;

/**
 * @author wight
 * @date 2021/11/22
 * @apiNote
 */
public abstract class AbstractDuckFactory {
    /**
     * createMallardDuck
     * @return Quackable
     */
    public abstract Quackable createMallardDuck();

    /**
     * createRedheadDuck
     * @return RedheadDuck
     */
    public abstract Quackable createRedheadDuck();

    /**
     * createDuckCall
     * @return DuckCall
     */
    public abstract Quackable createDuckCall();

    /**
     * createRubberDuck
     * @return RubberDuck
     */
    public abstract Quackable createRubberDuck();
}
