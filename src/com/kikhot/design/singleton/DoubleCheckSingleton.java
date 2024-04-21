package com.kikhot.design.singleton;

/**
 * 饿汉模式-线程安全-双重双检锁
 */
public class DoubleCheckSingleton {

    // 基于volatile来实现内存可见
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        // 第一次检查
        if (instance == null) {
            // 加锁保证线程安全
            synchronized (DoubleCheckSingleton.class) {
                // 再次检查防止同时进入synchronized
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
