package com.soon.innerclass;

class AnonyOuter {
    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnable(int i) { // == final int i

        int localNum = 10; // == final localNum = 10;

        return new Runnable() {
            int localClassNum = 50;

            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("localNum = " + localNum);
                System.out.println("localClassNum = " + localClassNum);

                System.out.println("outNum = " + outNum + " outer class instance variable");
                System.out.println("sNum = " + AnonyOuter.sNum + " outer class static variable");
            }
        };
    }

    Runnable runnable = () -> System.out.println("implement runnable anonymous class variable");
}

public class AnonymousTest {

    public static void main(String[] args) {
        AnonyOuter anonyOuter = new AnonyOuter();
        Runnable runnable = anonyOuter.getRunnable(9);
        runnable.run();
        anonyOuter.runnable.run();
    }
}
