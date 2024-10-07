package org.example.DefaultConstructor;

public class Student {
    String name;
    int age = 21;
    double psp;
    String universityName;
    boolean isPlaced;

    public Student(String name, String universityName) {
        this.name = name;
        this.universityName = universityName;
    }
}
