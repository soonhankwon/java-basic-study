package com.soon.object;

public class CompanySingleton {

    private static final CompanySingleton instance = new CompanySingleton();

    private CompanySingleton() {
    }

    public static CompanySingleton getInstance() {
        return instance;
    }
}
