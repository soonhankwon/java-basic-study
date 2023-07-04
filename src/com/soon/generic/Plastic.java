package com.soon.generic;

public class Plastic extends Material {
    @Override
    public String toString() {
        return "plastic material";
    }

    @Override
    public void doPrinting() {
        System.out.println("print plastic material");
    }
}
