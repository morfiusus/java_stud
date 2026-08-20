package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = readSeconds(sc);
        if(sec<0){
            System.out.println("Incorrect time");
        }else{
            int[] timer = timer(sec);
            printTime(timer);
        }
    }
    public static int[] timer(int sec){
            int min = sec/60;
            sec = sec%60;
            int chas = min/60;
            min=min%60;
            return new int[]{chas,min,sec};
    }
    public static int readSeconds(Scanner sc){
        System.out.println("Enter the number of seconds:");
        while(true) {
            try{
                int sec = sc.nextInt();
                sc.nextLine();
                return sec;
            }catch(java.util.InputMismatchException e){
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }
    public static void printTime(int [] time){
        System.out.printf("%02d:%02d:%02d",time[0],time[1],time[2]);
    }
}