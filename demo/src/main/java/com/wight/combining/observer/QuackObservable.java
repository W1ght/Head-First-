package com.wight.combining.observer;

/**
 * @author wight
 * @date 2021/11/23
 * @apiNote
 */
public interface QuackObservable {
    /**
     * registerObserver
     *
     * @param observer observer
     */
    void registerObserver(Observer observer);

    /**
     * notifyObservers
     */
    void notifyObservers();
}
