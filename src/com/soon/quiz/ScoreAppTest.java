package com.soon.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class ScoreAppTest {

    public static void main(String[] args) {

        Student lee = new Student("Lee");
        Student kim = new Student("Kim");

        Subject korean = new Subject("Korean");
        Subject math = new Subject("Math");
        Subject english = new Subject("English");

        ArrayList<Subject> leesSubjects = new ArrayList<>(Arrays.asList(korean, math));
        ArrayList<Subject> kimsSubjects = new ArrayList<>(Arrays.asList(korean, math, english));

        lee.registerSubject(leesSubjects);
        kim.registerSubject(kimsSubjects);

        lee.writeTestResult("Korean", 100);
        lee.writeTestResult("Math", 50);
        kim.writeTestResult("Korean", 70);
        kim.writeTestResult("Math", 85);
        kim.writeTestResult("English", 100);

        lee.printTotalScore();
        kim.printTotalScore();
    }
}
