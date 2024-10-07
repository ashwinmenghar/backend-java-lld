package org.example.Inheritance;

public class Dog extends Animal{
   String name;
    public Dog(String name, String type, int legs) {
        super(type, legs);
        this.name = name;
    }

}
