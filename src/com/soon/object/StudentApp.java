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
        Student soonhan1 = new Student(1, "soonhan", "seoul", subjects);
        soonhan.printSubject();
        soonhan.printFilteredSubject();
        soonhan.printTotalScore();

        CompanySingleton instance = CompanySingleton.getInstance();
        CompanySingleton instance2 = CompanySingleton.getInstance();
        System.out.println(instance == instance2);

        // 싱글톤 객체의 property 가 변경될때 ==, equals 체크 및 공유필드 변경 주의
        instance.setName("NAVER");
        System.out.println(instance == instance2);
        System.out.println(instance.equals(instance2));
        System.out.println(instance.getName() + "싱글톤 사용시 공유 필드 주의" + instance2.getName());

        // equals and hashcode 구현시 true
        System.out.println(soonhan.equals(soonhan1));
    }
}
