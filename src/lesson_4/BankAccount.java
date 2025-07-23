package lesson_4;

public class BankAccount {
    int zp;
    BankAccount(int zp1){
        zp = zp1;
    }
    int popolnenie(int price){
        int result =zp + price;
        return result;
    }
    int spisanie(int price){
        int result =zp - price;
        return result;
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(50);
        System.out.println(b1.zp);
        b1.zp=b1.popolnenie(100);
        System.out.println(b1.zp);
    }
}
