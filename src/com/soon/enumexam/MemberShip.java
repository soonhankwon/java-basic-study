package com.soon.enumexam;

public enum MemberShip {
    GENERAL(0.10, 0.01),
    VIP(0.20, 0.05);

    private final double discountRatio;
    private final double bonusAccumulationRatio;

    MemberShip(double discountRatio, double bonusAccumulationRatio) {
        this.discountRatio = discountRatio;
        this.bonusAccumulationRatio = bonusAccumulationRatio;
    }

    public double getDiscountRatio() {
        return discountRatio;
    }

    public double getBonusAccumulationRatio() {
        return bonusAccumulationRatio;
    }
}
