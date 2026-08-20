package org.example;

import java.util.concurrent.TimeUnit;

public class Dog extends Animal{
    Dog(String name, int age){
        super(name,age);
    }
    @Override
    public String toString(){return "Dog name = " + getName() + ", age = " + getAge();}

    @Override
    public double goToWalk() {
        double sec = getAge()*0.5;
        try {
            TimeUnit.SECONDS.sleep((long)sec);  // спим нужное время
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // корректная обработка прерывания
        }
        return sec;
    }
}
