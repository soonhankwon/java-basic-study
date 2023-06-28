package com.soon.object;

public class CompanySingleton {

    private String name;

    private static final CompanySingleton instance = new CompanySingleton();

    private CompanySingleton() {
    }

    public static CompanySingleton getInstance() {
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
