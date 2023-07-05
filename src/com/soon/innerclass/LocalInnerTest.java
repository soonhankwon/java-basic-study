package com.soon.innerclass;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) { // == final int i

        int localNum = 10; // == final localNum = 10;

        class MyRunnable implements Runnable {

            int localClassNum = 5;
            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("localNum = " + localNum);
                System.out.println("localClassNum = " + localClassNum);

                System.out.println("outNum = " + outNum + " outer class instance variable");
                System.out.println("sNum = " + Outer.sNum + " outer class static variable");
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(5);
        runnable.run();
    }
}
