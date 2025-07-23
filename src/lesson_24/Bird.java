package lesson_24;

abstract class Animal{
    Animal(String name){
        this.name = name;
    }
    String name ;
    abstract void eat();
    abstract void sleep();
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
    super(name);
    this.name = name;
}

    abstract void fly();
    public void speak(){
        System.out.println(name + " sing");
    }
}

abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("Vsegda interesno nabludat kaka spyt ribi");
    }
abstract void swim();
}

abstract class Mammal extends  Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Pingvin liubit est ribu");
    }
    void sleep(){
        System.out.println("Pingvini spiat prizhavshis drug k drugu");
    }
    void fly() {
        System.out.println("Pingvini ne ymeyt letat");
    }
     public void speak(){
        System.out.println("Pnigvini ne umeyt pet kak solovi");
    }
}

class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Kak luboy xishnik liubit est miaso");
    }
    void sleep(){
        System.out.println("Lev spit bolshuy chast dny");
    }
    void run(){
        System.out.println("Lev eto ne samaiy bistraiy koshka");
    }
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    void swim(){
        System.out.println("Mechenosec krasivay riba, kotoray bistro plavaet");
    }
    void eat(){
        System.out.println("Mechenosec ne xishnay riba i ona est obichniy ribiy korm");
    }
}
class lesson_24 {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("froggi");
        m1.swim();
        m1.eat();
        m1.sleep();

        Speakable p1 = new Pingvin("pororo");
        p1.speak();
        Animal l1 = new Lev("leva");
        l1.eat();
        l1.sleep();
        Mammal l2 = new Lev("lvica");
        l2.run();
        l2.speak();
        l2.eat();
        l2.sleep();
    }
}