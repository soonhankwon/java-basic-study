package com.soon.thread;

public class MyThread extends Thread {

    @Override
    public void run() {

        for(int i = 0; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
    }
}
