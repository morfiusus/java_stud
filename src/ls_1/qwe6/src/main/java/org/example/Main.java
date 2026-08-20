package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = readSize(sc);
        if(size>0) {
            double[] array = getArray(size, sc);
            double[] resarray = sortArray(array);
            for (int k = 0; k != resarray.length; k++) {
                System.out.println(resarray[k]);
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

    public static double[] getArray(int num, Scanner sc) {
        double[] array = new double[num];
        for (int i = 0; i != num; i++) {
            while (true) {
                try {
                    array[i] = sc.nextDouble();
                    sc.nextLine();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Could not parse a number. Please, try again");
                    sc.nextLine();
                }
            }
        }
        return array;
    }

    public static double[] sortArray(double[] array){
        for (int i = 0; i != array.length-1; i++)
        {
            int minInd = i;
            for(int j = i+1;j != array.length;j++)
            {
                if(array[j] < array[minInd]){
                    minInd = j;
                }
            }
            double temp = array[i];
            array[i] = array[minInd];
            array[minInd] = temp;
        }
        return array;
    }
}
