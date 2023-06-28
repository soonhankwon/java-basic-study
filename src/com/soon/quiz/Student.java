package com.soon.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    private static int sequence = 1000;
    private int id;
    private String name;
    private Map<Subject, Integer> subjectScoreMap = new HashMap<>();

    public Student(String name) {
        this.id = ++sequence;
        this.name = name;
    }

    public void registerSubject(ArrayList<Subject> registerSubjects) {
        registerSubjects.forEach(i -> subjectScoreMap.put(i, 0));
    }

    public void writeTestResult(String name, int score) {
        subjectScoreMap.put(new Subject(name), score);
    }

    public void printTotalScore() {
        System.out.println(this.name + " total score : " + subjectScoreMap.values().stream()
                .mapToInt(Integer::intValue)
                .sum());
    }
}
