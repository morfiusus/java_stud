package lesson_11;

public class Car {
    String color;
    String motor;
            int door;
            Car( String color,String motor,int door){
                this.color = color;
                this.motor = motor;
                this.door = door;
            }

}
class CarTest {
    static int changedoor(Car c1, int a){
        c1.door = a;
        return  c1.door;
    }
    static void swapcolor(Car c1,Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }
    public static void main(String[] args) {
        Car c1 = new Car("red", "v8", 4);
        Car c2 = new Car("green", "v8", 5);
        Car c3 = new Car("Orange", "v8", 5);
        changedoor(c1, 5);
        System.out.println(c1.door);
        changedoor(c2, 8);
        System.out.println(c2.door);
        System.out.println(c1.color + c3.color);
swapcolor(c1,c3);
        System.out.println(c1.color + c3.color);

    }
}