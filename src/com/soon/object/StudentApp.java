package com.soon.object;

import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        Student student = new Student(1, "soonhan", "bundang");
        Student student2 = new Student(1, "soonhan", "bundang");
        student.showStudentInfo();

        System.out.println(student);
        System.out.println(student2);

        Subject math = new Subject(70, "Math");
        Subject korean = new Subject(91, "Korean");

        List<Subject> subjects = List.of(math, korean);

        Student soonhan = new Student(1, "soonhan", "seoul", subjects);
        soonhan.printSubject();
        soonhan.printFilteredSubject();
        soonhan.printTotalScore();
    }
}
