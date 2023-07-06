package com.soon.thread;

class Bank {

    private int money = 10000;

    public void saveMoney(int money) {
//        synchronized (this) {
            int m = this.getMoney(); //m = 10000 copy
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(m + money);
//        }
    }

    public int getMoney() {
        return money;
    }

    public synchronized void minusMoney(int money) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(this.getMoney() - money);
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Kwon extends Thread {

    public void run() {
        synchronized (SynMainTest.myBank) {
            System.out.println("start save");
            SynMainTest.myBank.saveMoney(3000);
            System.out.println(" saveMoney(3000) : " + SynMainTest.myBank.getMoney());
        }
    }

}

class KwonWife extends Thread {
    public void run() {
        System.out.println("start minus");
        SynMainTest.myBank.minusMoney(1000);
        System.out.println(" minusMoney(1000) : " + SynMainTest.myBank.getMoney());
    }
}

public class SynMainTest {
    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Kwon k = new Kwon();
        k.start();

        Thread.sleep(200);

        KwonWife kyu = new KwonWife();
        kyu.start();
    }
}