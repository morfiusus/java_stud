package lesson_4;

public class Student {
    int n = 0, y = 0;
    double m = 0, a = 0, i = 0;
    String name = "", surname = "";

    public Student(int n, int y, double m, double a, double i, String name, String surname) {
        this.n = n;
        this.y = y;
        this.m = m;
        this.a = a;
        this.i = i;
        this.name = name;
        this.surname = surname;
    }
    public static void Studentif (Student s1, Student s2){
        if (s1.n == s2.n) {
            System.out.println("id ravni");
            if (s1.y == s2.y) {
                System.out.println("id ravni");
                if (s1.m == s2.m) {
                    System.out.println("id ravni");
                    if (s1.a == s2.a) {
                        System.out.println("id ravni");
                        if (s1.name == s2.name) {
                            System.out.println("id ravni");
                        } else System.out.println("studenti ravni ne polnostu");
                    } else System.out.println("studenti ravni ne polnostu");
                } else System.out.println("studenti ravni ne polnostu");
            } else System.out.println("studenti ravni ne polnostu");
        } else System.out.println("studenti ne ravni");
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, 1, 1, 1, 1, "asd", "asd");
        Student s2 = new Student(1, 1, 1, 1, 1, "as", "asd");
       Studentif(s1,s2);
    }
}
