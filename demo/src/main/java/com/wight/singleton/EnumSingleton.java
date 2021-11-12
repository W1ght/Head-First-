package com.wight.singleton;

public class EnumSingleton {
    private EnumSingleton() {}

    private enum Singleton{
        INSTANCE;

        private final EnumSingleton instance;

        Singleton() {
            instance = new EnumSingleton();
        }

        private EnumSingleton getInstance() {
            return instance;
        }
    }

    public static EnumSingleton getInstance() {
        // 具体在网络连接，数据库连接，线程池等等
        // 枚举提供了序列化机制
        return Singleton.INSTANCE.getInstance();
    }
}
