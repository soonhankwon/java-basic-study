package com.soon.inheritance;

public class Champion {
    private String name;

    public Champion(String name) {
        System.out.println("Champion.Champion");
        this.name = name;
    }

    void defaultSkillQ() {
        System.out.println("DEFAULT SKILL Q");
    }

    void defaultSkillE() {
        System.out.println("DEFAULT SKILL E");
    }

    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                '}';
    }
}
