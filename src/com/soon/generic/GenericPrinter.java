package com.soon.generic;

public class GenericPrinter<T> {

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public void print() {
        System.out.println(this.material);
    }
}
