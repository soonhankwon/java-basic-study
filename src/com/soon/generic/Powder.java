package com.soon.generic;

public class Powder extends Material {
    @Override
    public String toString() {
        return "powder material";
    }

    @Override
    public void doPrinting() {
        System.out.println("print power material");
    }
}
