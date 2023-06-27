package com.soon.object;

public class Subject {

    private int score;
    private String subjectName;

    public Subject(int score, String subjectName) {
        this.score = score;
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "score=" + score +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }

    public void printFilteredSubject() {
        if (this.score > 90)
            System.out.println(this.subjectName + " : " + this.score);
    }

    public int getScore() {
        return this.score;
    }
}
