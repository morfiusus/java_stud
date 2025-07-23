package lesson_17;

public class Ravenstvo {
    static boolean ravenstvo(StringBuilder q,StringBuilder w){
        boolean e = true;
        if(q.length()==w.length()){
            for(int i=0; i<q.length();i++){
                if(q.charAt(i)!=w.charAt(i)){
                    e = false;
                    break;
                }
            }
        }else e = false;
        return e;
    }

    public static void main(String[] args) {
        StringBuilder q1 = new StringBuilder("123");
        StringBuilder q2 = new StringBuilder("125");
        System.out.println(ravenstvo(q1,q2));
    }
}
