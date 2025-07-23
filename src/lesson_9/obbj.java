package lesson_9;

public class obbj {
    void obj(){
        obbj q1 = new obbj();
        obbj q2 = new obbj();
    }
    public static void main(String[] args) {
        obbj q3 = new obbj();
        q3.obj();
        q3.obj();
        q3.obj();
        obbj q1 = new obbj();
    }
}