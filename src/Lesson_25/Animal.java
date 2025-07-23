package Lesson_25;

abstract class Animal{
    Animal(String name){
        this.name = name;
    }
    String name ;
    abstract void eat();
    abstract void sleep();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name){
        super(name);
        this.name = name;
    }

    abstract void fly();
    public void speak(){
        System.out.println(name + " sing");
    }
}

abstract class Fish extends Animal {
    Fish(String name){
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("Vsegda interesno nabludat kaka spyt ribi");
    }
    abstract void swim();
}

abstract class Mammal extends Animal implements Speakable {
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

class Pingvin extends Bird {
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

class Lev extends Mammal {
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

class Mechenosec extends Fish {
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
        Animal a1 = new Pingvin("");
        Animal a2 = new Mechenosec("doris");
        Animal a3 = new Lev("simba");
        Bird b1 = new Pingvin("pororo");
        Mammal m1 = new Lev("simbaa");
        Fish f1 = new Mechenosec("froggy");
        Pingvin p1 = new Pingvin("porororor");
        Mechenosec m2 = new Mechenosec("dori");
        Lev l1 = new Lev("Leva");
        Speakable s1 = new Lev("slev");
        Speakable s2 = new Pingvin("spororo");

        Animal [] animals = {a1,a2,a3,b1,m1,f1,p1,m2,l1};


        for(Animal anima : animals){
            System.out.println("__________________________________");
            if(anima instanceof Pingvin){
                Pingvin p = (Pingvin) anima;
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (anima instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) anima;
                m.eat();
                m.sleep();
                m.swim();
            } else if (anima instanceof Lev){
                Lev l = (Lev) anima;
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
        }
        Speakable [] speak = {s1,s2,b1,l1,p1,m1};

        for(Speakable spi : speak){
            if(spi instanceof Pingvin){
                Pingvin p = (Pingvin) spi;
                p.speak();
            }
            else if(spi instanceof Lev){
                Lev l = (Lev) spi;
                l.speak();
            }
        }
    }
}


