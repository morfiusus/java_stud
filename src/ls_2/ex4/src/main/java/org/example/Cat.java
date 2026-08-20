package org.example;

public class Cat extends Animal{
    Cat(String name, int age){super(name,age);}
    public String toString(){return "Cat name: " + getName() + ", age: " + getAge();}
}
