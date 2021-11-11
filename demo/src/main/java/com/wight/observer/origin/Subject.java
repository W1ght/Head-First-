package com.wight.observer.origin;

public interface Subject {
    void registerObserver(Observer c);

    void removerObserver(Observer o);

    void notifyObservers();
}
