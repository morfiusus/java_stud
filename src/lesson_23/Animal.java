package lesson_23;

import lesson_10.p1.A;
import lesson_10.p1.p2.p3.C;
import lesson_10.p4.D;

public class Animal {
    String name;
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
    public static void getType(){
        System.out.println("This is an animal");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    public static void getType(){
        System.out.println("This is a dog");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
    public static void getType(){
        System.out.println("This is a cat");
    }
}
class Test{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.makeSound();
        c1.makeSound();
        d1.getType();
        c1.getType();
        a1.getType();
    }
}
