package com.soon.di;

public class TestConfig {

    private final DiContainer diContainer;

    public TestConfig(DiContainer diContainer) {
        this.diContainer = diContainer;
    }

    public Bean getBeanV1() {
        return diContainer.getBean("BEAN1");
    }

    public Bean getBeanV2() {
        return diContainer.getBean("BEAN2");
    }
}
