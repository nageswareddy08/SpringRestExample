package com.spring.rest;

/**
 * Created by Nageswar on 6/11/2018.
 */
public class DemoSingleton
{
    private static final long serialVersionUID = 1L;
    private DemoSingleton(){
        System.out.println("private constructor");
    }
    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();

    }

    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
