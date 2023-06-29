package com.soon.di;

public class BeanV2 implements Bean{

    private static final BeanV2 beanV2 = new BeanV2();

    private BeanV2() {
    }

    public static BeanV2 getInstance() {
        return beanV2;
    }
}
