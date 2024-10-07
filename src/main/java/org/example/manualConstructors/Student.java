package org.example.manualConstructors;

public class Student {
    String name;
    int age;
    boolean isPlaced;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student oldStd) {
        this.name = oldStd.name;
        this.age = oldStd.age;
    }
}
