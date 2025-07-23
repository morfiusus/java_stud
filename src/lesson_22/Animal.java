package lesson_22;
public class Animal {
    int eyes;
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }

    Animal(){
        System.out.println(" I am animal");
    }
}
class Pet extends Animal{
    String name;
    int tail = 1; //количество хвостов
    int paw = 4; //количество лап

    void run(){
        System.out.println("Pet runs");
    }
    void jamp(){
        System.out.println("Pet jamps");
    }

    Pet(){
        System.out.println("I am pet");
        eyes = 2;
    }
}
class Dog extends Pet{
    void play(){
        System.out.println("Dog Plays");
    }
    Dog(String name){
        this.name = name;
        System.out.println("I am dog and my name is :" + name);
    }

}
class Cat extends Pet{
    void sleep(){
        System.out.println("Cat Sleeps");
    }
    Cat(String name){
        this.name = name;
        System.out.println("I am cat and my name is :" + name);
    }
}
class Test{
    public static void main(String[] args) {
        Cat c1 = new Cat("Murka");
        c1.sleep();
        Dog d1 = new Dog("Rex");
        System.out.println(d1.paw);
        d1.drink();
        d1.eat();
        System.out.println(c1.tail);
        c1.run();
        d1.jamp();
        d1.play();
    }
}
