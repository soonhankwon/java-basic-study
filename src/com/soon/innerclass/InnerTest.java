package com.soon.innerclass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InnerClass inClass;

    public OutClass() {
        this.inClass = new InnerClass();
    }

    // instance inner class
    class InnerClass {

        int inNum = 100;
        // java16
//        static int sInNum = 200;
        void inTest() {
            System.out.println("num = " + num);
            System.out.println("sNum = " + sNum);
            System.out.println("inNum = " + inNum);
            System.out.println("inClass = " + inClass);
        }

        // java16
//        static void sTest() {
//            System.out.println("true = " + true);
//        }
    }

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("inNum = " + inNum + " using inner class variable");
            System.out.println("sInNum = " + sInNum + " using inner class static variable");
            System.out.println("sNum = " + sNum + " using outer class static variable");
        }

        static void sTest() {
            System.out.println("sNum = " + sNum + " using outer class static variable");
            System.out.println("sInNum = " + sInNum + " using inner class static variable");
        }
    }

    public void usingInClass() {
        inClass.inTest();
    }
}

public class InnerTest {

    public static void main(String[] args) {
        OutClass outer = new OutClass();
        outer.usingInClass();

        System.out.println("================");

        OutClass.InStaticClass.sTest();
        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        inStaticClass.inTest();
    }
}
