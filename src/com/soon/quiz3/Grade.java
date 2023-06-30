package com.soon.quiz3;

public enum Grade {
    SILVER(1), GOLD(2), VIP(3);

    private int score;

    Grade(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
