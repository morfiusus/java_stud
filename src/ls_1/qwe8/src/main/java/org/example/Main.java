package org.example;

import java.util.Scanner;public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validateNumber(sc);
    }
    public static void  validateNumber(Scanner sc){
        System.out.println("Enter number:");
        int count = 0;
        int temp = 0;
        while (true) {
            try {
                int num = sc.nextInt();
                if(count>0 && num<temp){
                    System.out.println("The sequence is not ordered from the ordinal number of the number " + count);
                    break;
                }
                temp = num;
                count++;
            } catch (java.util.InputMismatchException e) {
                if (count == 0){
                    System.out.println("Input error");
                }else {
                    System.out.println("The sequence is ordered in ascending order");
                }
                break;
            }
        }
    }
}