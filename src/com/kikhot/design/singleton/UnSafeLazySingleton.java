package com.kikhot.design.singleton;

/**
 * 懒汉模式-线程不安全
 */
public class UnSafeLazySingleton {
    // 对象并没有初始化
    private static UnSafeLazySingleton instance;

    private UnSafeLazySingleton() {
    }


    // 此处没有加synchronized所有不是同步的，多线程会产生问题，导致多个实例
    public static UnSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new UnSafeLazySingleton();
        }
        return instance;
    }

}
