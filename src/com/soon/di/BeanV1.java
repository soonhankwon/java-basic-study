package com.soon.di;

public class BeanV1 implements Bean{

    private static final BeanV1 bean = new BeanV1();

    private BeanV1() {
    }

    public static BeanV1 getInstance() {
        return bean;
    }
}
