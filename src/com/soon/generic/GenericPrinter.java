package com.soon.generic;

public class GenericPrinter<T extends Material> {

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public void doPrinting() {
        material.doPrinting();
    }
}
