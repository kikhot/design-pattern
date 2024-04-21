package com.kikhot.design.singleton;


/**
 * 饿汉模式-枚举实现-线程安全
 * 自动支持序列化机制，绝对防止多次实例化，避免多线程同步问题
 */
public enum EnumSingleton {

    INSTANCE;

    public void someMethod() {
        System.out.println("hello world");
    }
}
