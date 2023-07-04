package com.soon.generic;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        powderGenericPrinter.doPrinting();

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        plasticGenericPrinter.doPrinting();

//        new GenericPrinter<Water>(); compile error (no T extend)
    }
}
