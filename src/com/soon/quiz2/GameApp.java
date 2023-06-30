package com.soon.quiz2;

public class GameApp {

    public static void main(String[] args) {
        Player soon = new Player("SOON");
        soon.startGame(5);
        System.out.println("=======================");
        soon.upgradeLevel(new AdvancedLevel());
        soon.startGame(5);
        System.out.println("=======================");
        soon.upgradeLevel(new SuperLevel());
        soon.startGame(5);
    }
}
