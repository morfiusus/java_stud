package lesson_6;

public class metods {
    void summa(int a,int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    void summa(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void summa(int a,int b){
        System.out.println(a+b);
    }
    void summa(int a){
        System.out.println(a);
    }
    void summa(){
        System.out.println("0");
    }

    public static void main(String[] args) {
        metods M = new metods();
        M.summa(1,2,3,4);
        M.summa(1,2,3);
        M.summa(1,2);
        M.summa(1);
        M.summa();
    }
}
