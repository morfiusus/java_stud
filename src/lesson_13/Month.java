package lesson_13;

public class Month {
   static void month(int a){
        switch (a){
            case 1,3,5,7,8,10,12:
                System.out.println("31");
                break;
            case 4,6,9,11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
                break;

        }
    }

    public static void main(String[] args) {
        month(5);
        month(4);
        month(2);
    }
}
