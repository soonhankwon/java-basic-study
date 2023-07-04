package com.soon.generic;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        powderGenericPrinter.print();

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        plasticGenericPrinter.print();
    }
}
