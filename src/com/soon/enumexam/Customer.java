package com.soon.enumexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

    private static int sequence = 0;

    private int id;
    private String name;
    private MemberShip grade;
    private int bonusPoint;

    private final List<Item> items = new ArrayList<>();

    public Customer(String name, MemberShip grade) {
        this.id = ++sequence;
        this.name = name;
        this.grade = grade;
    }

    public void chargePoint(int money) {
        this.bonusPoint += money;
    }

    public void buyItem(Item javaBook) {
        int discountPrice = (int) (javaBook.getPrice() * this.grade.getDiscountRatio());
        int discountedPrice = javaBook.getPrice() - discountPrice;
        this.bonusPoint -= discountedPrice;
        items.add(javaBook);
        System.out.println(discountedPrice + "원 할인된 최종 금액입니다.");
        increasePointCaseByGrade(discountedPrice);
    }

    private void increasePointCaseByGrade(int discountedPrice) {
        int point = (int) (discountedPrice * grade.getBonusAccumulationRatio());
        this.bonusPoint += discountedPrice * grade.getBonusAccumulationRatio();
        System.out.println(point + "원 적립");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", bonusPoint=" + bonusPoint +
                ", items=" + items +
                '}';
    }
}
