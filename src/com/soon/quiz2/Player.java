package com.soon.quiz2;

public class Player {
    private static int sequence = 0;
    private String name;
    private PlayerLevel playerLevel;

    public Player(String name) {
        this.name = name;
        this.playerLevel = new BeginnerLevel();
        this.playerLevel.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        System.out.print("UPGRADED ");
        this.playerLevel.showLevelMessage();
    }

    public void startGame(int count) {
        playerLevel.go(count);
    }
}
