package com.kikhot.design.singleton;


/**
 * 懒汉模式-静态内部类实现-线程安全
 * Singleton 类被装载了，instance 不一定被初始化
 * 因为 SingletonHandler 类没有被主动使用，只有通过显示调用 getInstance 方法时，才会显示装载 SingletonHolder 类
 */
public class InnerStaticSingleton {

    // 通过引入静态内部类 holder 来避免之前所介绍的，一加载就初始化的问题
    private static class SingletonHolder {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }


    private InnerStaticSingleton() {
    }

    public static final InnerStaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
