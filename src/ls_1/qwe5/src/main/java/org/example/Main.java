package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = readSize(sc);
        if(num > 0) {
            int[] res = getArray(num, sc);
            if (res == null) {
                System.out.println("There are no such elements");
            } else {
                for (int i = 0; i != res.length; i++) {
                    System.out.println(res[i]);
                }
            }
        }
    }

    public static int readSize(Scanner sc) {
        System.out.println("Enter count number:");
        while (true) {
            try {
                int num = sc.nextInt();
                sc.nextLine();
                if (num <= 0) {
                    System.out.println("Input error. Size <= 0");
                }
                return num;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Could not parse a number. Please, try again");
                sc.nextLine();
            }
        }
    }

    public static int[] getArray(int num, Scanner sc) {
        int[] array = new int[num];
        int countTrue = 0;
        for (int i = 0; i != num; i++) {
            while (true) {
                try {
                    array[i] = sc.nextInt();
                    if (doubleNum(array[i])){
                        countTrue++;
                    }
                    sc.nextLine();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Could not parse a number. Please, try again");
                    sc.nextLine();
                }
            }
        }
        if (countTrue > 0) {
            int[] arrayDoubleNum = new int[countTrue];
            int idx = 0;
            int i = 0;
            while (i != num) {
                if (doubleNum(array[i])) {
                    arrayDoubleNum[idx] = array[i];
                    idx++;
                }
                i++;
            }
            return arrayDoubleNum;
        } else {
            return null;
        }
    }

    public static boolean doubleNum(int ind) {
        int last = ind % 10;
        while (Math.abs(ind) >= 10) {
            ind = ind / 10;
        }
        return Math.abs(ind) == Math.abs(last);
    }
}