package org.example.manualConstructors;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Ashwin", 26);
        Student st2 = new Student(st1);
        st2.name = "Ashu";
        System.out.println("DEBUG");
//        st2.name = "Menghar";
//
//        System.out.println(st1.name);
//        System.out.println(st2.name);
    }
}
