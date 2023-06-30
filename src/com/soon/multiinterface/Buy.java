package com.soon.multiinterface;

public interface Buy {
    void buy();

    default void print() {
        System.out.println("PRINT PRINT");
    }
}
