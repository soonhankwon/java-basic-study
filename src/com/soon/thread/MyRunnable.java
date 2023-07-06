package com.soon.thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();
    }
}
