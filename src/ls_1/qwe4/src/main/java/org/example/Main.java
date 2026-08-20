package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = readSize(sc);
        if(size > 0) {
            int res = getNegativeArifm(size, sc);
            if(res == 0) {
                System.out.println("There are no negative elements");
            }else {
                System.out.println(res);
            }
        }
    }
    public static int readSize(Scanner sc){
        System.out.println("Enter count number:");
        while(true) {
            try{
                int num = sc.nextInt();
                sc.nextLine();
                if(num <= 0){
                    System.out.println("Input error. Size <= 0");
                }
                return num;
            }catch(java.util.InputMismatchException e){
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }
    public static int getNegativeArifm(int num, Scanner sc){
        int[] sred_arifm = new int[num];
        int negativeCount = 0;
        int res = 0;
        for(int i = 0;i!=num;i++){
            while(true) {
                try{
                    sred_arifm[i] = sc.nextInt();
                    sc.nextLine();
                    if(sred_arifm[i]<0){
                        res = res + sred_arifm[i];
                        negativeCount++;
                    }
                    break;
                }catch(java.util.InputMismatchException e){
                    System.out.println("Could not parse a number. Please, try again");
                    sc.nextLine();
                }
            }
        }
        if(negativeCount!=0){
            return res/negativeCount;
        }else{
            return negativeCount;
        }
    }
}