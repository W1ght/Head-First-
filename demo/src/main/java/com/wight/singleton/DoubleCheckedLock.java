package com.wight.singleton;

public class DoubleCheckedLock {
    private volatile static DoubleCheckedLock uniqueInstance;

    private DoubleCheckedLock() {}

    public static DoubleCheckedLock getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLock.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLock();
                }
            }
        }
        return uniqueInstance;
    }
}
