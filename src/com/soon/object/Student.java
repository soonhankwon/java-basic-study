package com.soon.object;

import java.util.List;
import java.util.Objects;

public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    private List<Subject> subjects;

    public void showStudentInfo() {
        System.out.println("id : " + this.studentId + " name : " + this.studentName + " address : " + this.studentAddress);
    }

    public String getStudentName() {
        return this.studentName;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, String studentAddress, List<Subject> subjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.subjects = subjects;
    }

    public void printSubject() {
        this.subjects.forEach(System.out::println);
    }

    public void printFilteredSubject() {
        this.subjects.forEach(Subject::printFilteredSubject);
    }

    public void printTotalScore() {
        int sum = this.subjects.stream()
                .mapToInt(Subject::getScore)
                .sum();
        System.out.println(sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentName, student.studentName) && Objects.equals(studentAddress, student.studentAddress) && Objects.equals(subjects, student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentAddress, subjects);
    }
}
