package com.kikhot.design.singleton;

/**
 * 懒汉模式-线程安全
 */
public class SafeLazySingleton {

    private static SafeLazySingleton instance;

    private SafeLazySingleton() {
    }

    public static synchronized SafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new SafeLazySingleton();
        }
        return instance;
    }

}
