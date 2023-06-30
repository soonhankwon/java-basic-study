package com.soon.multiinterface;

public class MyClassInterface implements MultiExtendsInterface {

    public static void main(String[] args) {
        MultiExtendsInterface myClassInterface = new MyClassInterface();
        myClassInterface.x();
        myClassInterface.y();
        myClassInterface.z();
    }

    @Override
    public void z() {
        System.out.println("MyClassInterface.z");
    }

    @Override
    public void x() {
        System.out.println("MyClassInterface.x");
    }

    @Override
    public void y() {
        System.out.println("MyClassInterface.y");
    }
}
