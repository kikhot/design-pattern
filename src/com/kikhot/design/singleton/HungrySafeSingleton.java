package com.kikhot.design.singleton;


/**
 * 饿汉模式-线程安全
 * 类加载时就初始化，但是会出现浪费内存的情况
 * 基于 classloader 机制避免了多线程的同步问题， instance 在类加载时就进行实例化了
 */
public class HungrySafeSingleton {

    private static HungrySafeSingleton instance = new HungrySafeSingleton();

    private HungrySafeSingleton() {
    }

    public static HungrySafeSingleton getInstance() {
        return instance;
    }

}
