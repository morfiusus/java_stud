package lesson_8;

public class Stat {

    static final double P = 3.14;

    static int proiz(int a,int b, int c){
        int result = a*b*c;
        System.out.println(result);
        return result;
    }
    static void del(int a,int b){
        int result = a/b;
        int result1 = a%b;
        System.out.println("Delenie :"+result+" Ostatok :"+result1);
    }

    void ploshad(double r){
        double s = P*r*r;
        System.out.println(s);
    }
    static void dlinna(double r){
        double dl = 2*P*r;
        System.out.println(dl);
    }
    void info(double r){
        System.out.println(r);
        ploshad(r);
        dlinna(r);
    }
}
class StatTest {
    public static void main(String[] args) {
Stat s1=new Stat();
        s1.proiz(4, 3, 5);
        s1.proiz(2,1,5);
        s1.del(5,4);
        s1.del(8,4);
        s1.ploshad(5);
        s1.dlinna(5);
        s1.info(5);
    }
}