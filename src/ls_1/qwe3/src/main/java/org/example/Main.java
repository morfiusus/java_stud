package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = readNumFibanachi(sc);
    if(n>46 || n<0) {
        System.out.println("Too large n");
    }else{
        int res = calcFibanachi(n);
        System.out.println(res);
    }
    }

    public static int readNumFibanachi(Scanner sc){
        System.out.println("Enter the number:");
        while(true) {
            try{
                int num = sc.nextInt();
                sc.nextLine();
                return num;
            }catch(java.util.InputMismatchException e){
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }

    public static int calcFibanachi(int n){
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return calcFibanachi(n - 1)+calcFibanachi(n-2);
    }
}
