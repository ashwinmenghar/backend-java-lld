package org.example.Inheritance;

public class Client {
    public static void main(String[] args) {

        Dog dog = new Dog("Sheru","Dog", 4);
        System.out.println(dog.type);
        System.out.println(dog.legs);

        Animal ani = new Animal("Cat", 4);
        System.out.println(ani.type);
        System.out.println(ani.legs);
    }


}
