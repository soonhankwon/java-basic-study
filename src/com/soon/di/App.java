package com.soon.di;

public class App {

    private final Bean bean;

    public App(TestConfig testConfig) {
        this.bean = testConfig.getBeanV1();
    }

    public static void main(String[] args) {
        DiContainer diContainer = new DiContainer();
        diContainer.init();
        App app = new App(new TestConfig(diContainer));
        System.out.println(app.bean.getClass());
    }
}
